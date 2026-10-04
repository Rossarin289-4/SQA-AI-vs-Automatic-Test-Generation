package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "+11"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "a,a,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1e101.1234567"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"11"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1.5ad"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "12345/789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "\t\t"}, {"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "trufa"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "tru1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"1.12345567"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}, {"org.apache.commons.csv.CSVRecord", "get", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"-2147483594"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1e101.12}34567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{" "}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"\u00e7"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "a,b,b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"\u00e92.5"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"55."}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "/a/b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "2.5d"}}, 1), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"<a>b;/a>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "<a>b</a>"}}, 3), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "/`/b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "101E-5"}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "11.12345678TITLE"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"\013http://example.com/a?b=c"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "2020-01-01"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"b,b,c"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"a\u00e9/b"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"0xFFGFFFF"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"1.1234567991123456"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1f10"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", ".6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"\014"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "i"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "anull"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 2), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1.5f-0.0true"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"1.1334567"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"1.123456789901234567"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFE"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-56"}, {"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"33554442"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"1.4"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", ".5e"}, {"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"12:302;45"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "0x1123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "1073741823"}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}}), new String[][]{{"hasNext", "", "4"}, {"next", "", "0"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"\010"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"1.1234"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "-15"}}), new String[][]{{"hasNext", "", "1"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"010123456789012345678901234567890"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"1e101.1234577"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "a1T5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"+"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF\t"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"123456789012335678901234567890"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "0x1B3456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "0x12345678m9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"-2true"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "2020-01-011L"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}0xFFFFFFFF"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{".6"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1;L"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"aB"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "-E9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}, {"org.apache.commons.csv.CSVRecord", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "7"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "-0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1CE-5"}}, 3), new String[][]{{"next", "", "7"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.1234578"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1.12245678-0.0"}}, 3), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1e101.1234567PT1H"}, {"org.apache.commons.csv.CSVRecord", "size", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"a,b,c1.1234567"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}, {"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"-11.1234566"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}, {"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1.5e300"}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"-1.15"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"0xF=FFFFFFF"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "67108864"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "{\"a\":1}"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", " T11H"}, {"org.apache.commons.csv.CSVRecord", "values", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "i+1"}}, 2), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}, {"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "\010"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isConsistent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "--1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "16777215"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "C"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1e11.1234567"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "aaaaaaaaaaaaa-aaaaaaaaaa}aaaaaa"}, {"org.apache.commons.csv.CSVRecord", "getComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}, {"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "123456789012345678901234567890"}}, 2), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "7-0.0"}, {"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"\037"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "h"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "<null>"}, {"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "nu}l"}}, 2), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "0xx1F1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}), new String[][]{{"next", "", "6"}, {"next", "", "3"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "167772160"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "-0./"}}), new String[][]{{"next", "", "3"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}, {"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1.5ff"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.1d"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"java.lang.String"}, new String[]{"0Title"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"{a\":2}"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "2e00"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getComment", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "2147483647"}, {"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"b"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1e101.1234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "<a>b<0a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"-I"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "a, ,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "b"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}, {"org.apache.commons.csv.CSVRecord", "values", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isMapped", new String[]{"java.lang.String"}, new String[]{"1d10"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "11.5f"}}, 1), new String[][]{{"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 1), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "-1"}}, 2), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "\037"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1.5e300"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "isSet", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:{61:61[1,2]"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "int", "47"}, {"org.apache.commons.csv.CSVRecord", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVRecord", "getComment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, , a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, , a] {getComment=, getRecordNumber=2, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "+0/0"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}, {"org.apache.commons.csv.CSVRecord", "toString", ""}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getComment=0, getRecordNumber=8, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVRecord", "isMapped", "java.lang.String", "1L"}, {"org.apache.commons.csv.CSVRecord", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getComment=, getRecordNumber=6, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVRecord", "getRecordNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getComment=0, getRecordNumber=4, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "getRecordNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "1L1.5d"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "isConsistent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "values", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVRecord", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a] {getComment=a, getRecordNumber=7, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVRecord", "values", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayItr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getComment=sample, getRecordNumber=5, isConsistent=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVRecord", "get", "java.lang.String", "1e10"}, {"org.apache.commons.csv.CSVRecord", "isSet", "java.lang.String", "[1,].5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getComment=sample, getRecordNumber=9223372036854775807, isConsistent=false, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVRecord", "org.apache.commons.csv.CSVRecord", "get", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getComment=a, getRecordNumber=3, isConsistent=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
