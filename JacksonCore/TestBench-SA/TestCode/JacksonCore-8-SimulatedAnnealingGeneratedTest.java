package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "262145", "262145"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262145", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\r"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\r {getCurrentSegment=[\r, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\r], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2020-01-01 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 0, 1, -, 0, 1], getTextOffset=0, hasTextAsCharacter...#216#-412128488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"*"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "10"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[*], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "*"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[*], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\uffff"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "2097172", "551"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#113235541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "524292", "-1073741803"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "524292", "524292"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "33554686", "-1001"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=-1001, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "2097172", "262102"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "a,b,c", "2097172", "262109"}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:2>", "-2147483648", "524288"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "262162", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>b</a> {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[<, a, >, b, <, /, a, >], getTextOffset=0, hasTextAsCharacters=true, size=8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "500", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.1234567 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, ., 1, 2, 3, 4, 5, 6, 7], getTextOffset=0, hasTextAsCharacters=true, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1", "262109", "-1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"1073741812"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "262109", "2097172"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "0x123456789", "10", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "9 {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[9], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1318#-329381427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.12345678", "134218728", "262145"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1e10"}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1e10 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, e, 1, 0], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"e"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "+1", "1001", "1027"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1146#-1610151121", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\n"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<empty>", "67109372", "516"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "262143"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "1027", "524292"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "500"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[\000], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"B\n00-100.;a/a/aTITLE[1,2]", "5", "3"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "-1048512", "316"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#436#730148957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"B\n00-100..;a/a/aITL-E[1,2]", "1", "3"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", ".5", "-2147483646", "-1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1321#-1916514505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"/x2020-0230T25:61:610aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1073741823", "268436956"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5d", "-537919989", "-2005"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "209"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "1073741823", "209"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "457"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2097172"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "1073741812", "-1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1027"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "{\"a\":1}", "10", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "{\"a\":1}", "10", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "010"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "{\"a\":1}", "10", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "010"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "010 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0, 1, 0], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "010"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "010 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0, 1, 0], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "5. {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[5, .], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "5. {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[5, .], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.12345678", "262109", "262109"}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "262143", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", " "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "262143", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x123456789", "1000", "1073741812"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "i"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x123456789", "134218728", "-2147483648"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "i"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"bx1233n56789", "67109372", "-1073741824"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "h"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "-2147483648", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "1000"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "5."}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"010a b"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "1073741767"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "010a b {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0, 1, 0, a,  , b], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "262143", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"<a>b<n`>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>b<n`> {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[<, a, >, b, <, n, `, >], getTextOffset=0, hasTextAsCharacters=true, ...#207#-708807183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "\u00e8 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[\u00e8], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{""}, false, 12, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"010"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "010 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0, 1, 0], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "1073741812", "1001"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "1073741812", "-1001"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-1001, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "1073741812", "-1001"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "262109", "-1001"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "1027", "999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "262109", "-1001"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "1027", "999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "262109", "-1001"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "1027", "999"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 23, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "134218728"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-134218728"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\r"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"\":1}", "-1073741823", "1073737688"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "-1001", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#417#-703304135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "1", "134218728"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "3"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "134218811"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "a"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\r {getCurrentSegment=[\r, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\r], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\r"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{":"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "67109372"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"/"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#33554809#1828493597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "262144", "262143"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "524288", "262109"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "524288", "1073741812"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2147483647, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2147483646, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1073741823, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"536870911"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=536870911, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1073741812"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483624"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-2147483624, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483608"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-2147483608, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "262144"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=262144, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2097172"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "0", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\u00e9 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[\u00e9], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "0", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\u00e8 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[\u00e8], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "0", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2020-02-30T25:61:61 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 0, 2, -, 3, 0, T, 2, 5, :, 6, 1, :, 6, 1], getTextOffset=0, hasTextAsChar...#221#1220313501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T26:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "0", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2020-02-30T26:61:61 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 0, 2, -, 3, 0, T, 2, 6, :, 6, 1, :, 6, 1], getTextOffset=0, hasTextAsChar...#221#1755360927", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.1234567", "-1", "1001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "262109", "1001"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-262109", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "-1", "262145"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "{\"a\":1}", "10", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "5. {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[5, .], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "262109", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.12345678", "262109", "262109"}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "262143"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "-262145", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"true", "1000", "1073741812"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "134218728"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"1000"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "67109372"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67109372", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=67109372, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "PT1H", "1000", "67109372"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "262109", "-1001"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "1027", "999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "262109", "134218728"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134218728", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "-1", "-1", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "0", "262109"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262109", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "524288", "-1001"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "262109", "1001"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "-1", "1000"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1118#-329441009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "-1", "500"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#617#-703244553", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "-1", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "1.12345678901234567 {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[1, ., 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7], getTextOffset=0, hasTextAsCharacters=true, size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "-1001", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#417#-703304135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "134218751"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
  assertEquals("receiver state after the call", "\r {getCurrentSegment=[\r, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\r], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\000], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2147483647", "-134218744"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-134218744, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "a"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#33554809#-1604640097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"h"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#33554809#620947478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"H"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#33554809#-283488266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\000"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#33554809#-1244726866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\000"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5", "999", "33554686"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "1073741812"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000 {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[\000], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "524288"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=524288, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"7"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "7 {getCurrentSegment=[7, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[7], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"Hello, World", "500", "2097172"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"Hello, World", "500", "2097172"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"Hello, World", "500", "2097172"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\uffff"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"5"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "5 {getCurrentSegment=[5, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[5], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"F"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "F {getCurrentSegment=[F, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[F], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"E"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "E {getCurrentSegment=[E, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[E], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"E"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "E {getCurrentSegment=[E, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[E], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"a"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"`"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "` {getCurrentSegment=[`, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[`], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"_"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "_ {getCurrentSegment=[_, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[_], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"x"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "x {getCurrentSegment=[x, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[x], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"67109372"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=67109372, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=500, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "2097172", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "2097172", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "2097172", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "59"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=59, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1000, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-1000, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-1000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-1000, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-1000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1000", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-936"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-936", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-468"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-468", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-468"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-468", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-468, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-532"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-532", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-532, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:2>", "262143", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "33554731"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "33554731"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "+1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "+1 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[+, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "+1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "+1 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[+, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "m1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "m1 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[m, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "m1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "m1 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[m, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "m1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "m1 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[m, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "m1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "m1 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[m, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "m11"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "m11 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[m, 1, 1], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("999", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "499"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("499", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "499"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("499", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=499, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "500"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("500", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=500, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "2020-01-01 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 0, 1, -, 0, 1], getTextOffset=0, hasTextAsCharacter...#216#-412128488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "0", "2147483647"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "h"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, ., 5, e, 3, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size...#203#-1691445212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:2>", "2147483647", "-1073741824"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, ., 5, e, 3, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size...#203#-1691445212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, ., 5, e, 3, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.5e300 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, ., 5, e, 3, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-786466"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-786466"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "1027", "262109"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "/"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[/, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "999", "33554686"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "500", "262143"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[{, \", a, \", :, 1, }]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"a\":1} {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[{, \", a, \", :, 1, }], getTextOffset=0, hasTextAsCharacters=true, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5d", "134218728", "262143"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.5d", "268437456", "262143"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "524292", "524288"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "500"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=500, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1000, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1011"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "<null>", "-2147483648", "33554686"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "524292", "524292"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "-2147483648", "-1001"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "2097172", "262109"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"2097172"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "524292", "262143"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "524292", "262143"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "524292", "262143"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "524292", "-131071"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000,  ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-131071, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:3>", "524292", "-131071"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "/ {getCurrentSegment=[/, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[/], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
