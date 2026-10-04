package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "E50x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "E50x1F {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[E, 5, 0, x, 1, F], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "262161"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"\n-1.5", "-2147483648", "2147483602"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:5>", "1", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:6>", "2147483647", "1010"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "4097"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "", "-225", "262152"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#262272#-1999109138", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "http://example.com/a?b=", "262238", "1001"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1119#-329440978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:4>", "2147483647", "262093"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", ";"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "1073741823", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "17039362", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{" Title", "-945", "122890"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "2147483647", "-262161"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:5>", "8691", "262143"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"56"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:2>", "1073741823", "262251"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.1234567890123456"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "-"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[-, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#715157507", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[-, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "f"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:3>", "2147483647", "950"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[f, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.1234567890123456", "0", "10"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.12345678 {getCurrentSegment=[1, ., 1, 2, 3, 4, 5, 6, 7, 8, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=10, getTextBuffer=[1, ., 1, 2, 3, 4, 5, 6, 7, 8], getTextOffset=0, hasTextAsCharacte...#217#636806104", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "0xEFFFFFFF", "262145", "-1057"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "17"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "e"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"null1000", "2000", "2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "131071", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "0", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "  {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[ ], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {getCurrentSegment=[1, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[1], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{","}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "524290"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#318#-397159892", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "122890", "2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "1000", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:7>", "4345", "524290"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "524290"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#524410#550765916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"262145"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "-1000", "1010"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "0.35"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0.35", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.35 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0, ., 3, 5], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"262272"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "C"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "C {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[C], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:5>", "1", "524371"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "0\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#524521#-871716328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "1011"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-944", "-1000"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "2096208", "262152"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"524288"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.1234567890123456<a>b</a>", "-2", "-896"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "1", "0"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{".5f", "2147483647", "2096208"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "I:", "-2013265920", "1000"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "262133", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-262172", "-1060"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1524", "1006"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"-2002"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"58.", "-2147483647", "262272"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[t, r, u, e], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "262144"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "393232"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"0x1F1000"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0x1F1000 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0, x, 1, F, 1, 0, 0, 0], getTextOffset=0, hasTextAsCharacters=true, ...#207#852697707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "n"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"262144"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "131085", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=262144, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"1000"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"-536870902"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\014"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\014 {getCurrentSegment=[\014, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\014], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Hello, Wor"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"4"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", ":"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", ":\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#1331810606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483645"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:6>", "-1000", "1048104"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1http://example.com/a?b=c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1http://example.com/a?b=c {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, h, t, t, p, :, /, /, e, x, a, m, p, l, e, ., c, o, m, /,.., getTextOffset=0, ha...#232#-1981802621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-977"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "2020-02-30T25:61:61 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 0, 2, -, 3, 0, T, 2, 5, :, 6, 1, :, 6, 1], getTextOffset=0, hasTextAsChar...#221#1220313501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "+"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Titld-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{":"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", ": {getCurrentSegment=[:, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[:], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.12345o67", "2147483647", "0"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "262143"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262143", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-1998", "262145"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2147483647, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.0 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[-, 0, ., 0], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "2147483647", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "262145"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{":"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", ": {getCurrentSegment=[:, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[:], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.1234567[1,2]", "2147483645", "131082"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "10", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "1", "262152"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "11234567890123456\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"0", "262272", "1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "Itue", "262152", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"F\u00ea", "17383", "-1001"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "2147483647", "2096208"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\r"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\r {getCurrentSegment=[\r, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\r], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "", "-944", "2147483599"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "TITLF-1.5", "17429", "-1000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"253960"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "1073741822"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.1234568901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1.1234568901234567 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, ., 1, 2, 3, 4, 5, 6, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7], getTextOffset=0, hasTextAsCharacte...#217#-1915777358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"1x1F"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "1x1F {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, x, 1, F], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\ufffe"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\ufffe {getCurrentSegment=[\ufffe, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\ufffe], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"0x"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "990", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0x {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0, x], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "262143"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=262143, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"", "999", "1001"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:1>", "-262143", "17383"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"262197"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=262197, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"376960"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=376960, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"p"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "262664", "65541"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "p {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[p], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "a,b,caaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "33816593"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33816593", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "12{3456789012345678901234567890Title", "1017", "1000"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "0x123457789", "262271", "524322"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"F", "-508", "-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"/ab"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "/ab {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[/, a, b], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"1998"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1L {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, L], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "65541"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=65541, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"-131090"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-131090, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "-2"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "262131", "1011"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"3"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "3 {getCurrentSegment=[3, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "2147483647", "131072"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-0.5 {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[-, 0, ., 5], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:3>", "262693", "1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "12:30::45", "1310740", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"?"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "? {getCurrentSegment=[?, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[?], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "262215", "131080"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "138"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=138, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-11-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-11-5 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[-, 1, 1, -, 5], getTextOffset=0, hasTextAsCharacters=true, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "o"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[o, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:7>", "262259", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "F"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "F {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[F], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "1055", "262093"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:4>", "999", "524245"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "262244", "-967"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1", "7"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "F", "-262135", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"262401"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", ":"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "M"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[M]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "M {getCurrentSegment=[M, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[M], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\r"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\r {getCurrentSegment=[\r, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\r], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"["}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ {getCurrentSegment=[[, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[[], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "-1o5", "-1", "17370"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "17383", "1000"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "x"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "x {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[x], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:5>", "-1000", "67370993"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "<"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "<\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-220169490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "8"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[8, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-355504690", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[8, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "1073741801"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741801", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1073741801, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "9"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9 {getCurrentSegment=[9, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[9], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "p"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[p]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "p {getCurrentSegment=[p, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[p], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "+"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[+]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "+ {getCurrentSegment=[+, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[+], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "t"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[t, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-1900513014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "t {getCurrentSegment=[t, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[t], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:5>", "10", "-225"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-37"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "2020-11-01"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[2, 0, 2, 0, -, 1, 1, -, 0, 1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2020-11-01 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, 0, 2, 0, -, 1, 1, -, 0, 1], getTextOffset=0, hasTextAsCharacter...#216#1192210586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "[1,2]\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[1,2]\u00e9 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[[, 1, ,, 2, ], \u00e9], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:2>", "131076", "263"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-289", "-4"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1318#-329381427", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:4>", "-2147483648", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "1073741797", "262272"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:5>", "1310740", "131144"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "F"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[F, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-1718165668", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "F {getCurrentSegment=[F, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[F], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\uffff"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"524245"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<empty>", "262028", "262401"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1.12345678902345612:30::45", "249", "268435455"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"[1,2]", "-500", "-1036"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "\010\010", "262145", "262188"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "<"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[<, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.5f0x123456789"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "1.5f0x123456789 {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[1, ., 5, f, 0, x, 1, 2, 3, 4, 5, 6, 7, 8, 9], getTextOffset=0, hasTextAsCharacters=true, size=15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "?"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "?\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#1746827662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "{"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[{, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#1713123793", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[{, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "abb"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, b, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "abb {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[a, b, b], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-904"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "524290"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("524290", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=524290, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", ",1"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "/a/bItue"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/bItue", String.valueOf(actual));
  assertEquals("receiver state after the call", "/a/bItue {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[/, a, /, b, I, t, u, e], getTextOffset=0, hasTextAsCharacters=true, ...#207#-708939485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "0", "-1073741824"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "\t-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\t-1 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[\t, -, 1], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "262032", "2147483644"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "1073741823", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Title"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[T, i, t, l, e]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Title {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[T, i, t, l, e], getTextOffset=0, hasTextAsCharacters=true, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "\n-1.5TITLE"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\n, -, 1, ., 5, T, I, T, L, E]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\n-1.5TITLE {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[\n, -, 1, ., 5, T, I, T, L, E], getTextOffset=0, hasTextAsCharacter...#216#-1645560410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:5>", "1000", "-1094"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-1094, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", ","}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "^"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[^, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#240811380", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "^ {getCurrentSegment=[^, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[^], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "32833", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32833", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\ufffd"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\ufffd {getCurrentSegment=[\ufffd, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\ufffd], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "9", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "262246", "-262161"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-262161, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"1.26\u00e9"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "1.26\u00e9 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, ., 2, 6, \u00e9], getTextOffset=0, hasTextAsCharacters=true, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"D", "-2", "-999"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "65541"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:5>", "0", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-910"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-910, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "W"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "W\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1318#-44981290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "10000x123456789", "65541", "61445"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "527", "655370"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"p"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "p {getCurrentSegment=[p, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[p], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\ufffe"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\ufffe {getCurrentSegment=[\ufffe, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\ufffe], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "d"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[d, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-343186182", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[d, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"1"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "x"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "x1 {getCurrentSegment=[x, 1, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=2, getTextBuffer=[x, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:4>", "17383", "8691"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8691", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"21474"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "21474 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 1, 4, 7, 4], getTextOffset=0, hasTextAsCharacters=true, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "1055", "-262175"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "524286"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-262175, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "D"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "131076"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[D, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-1523499814", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[D, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "1000", "-2147483648"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "262403", "-786431"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-786431", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:5>", "2147483647", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, ...#269#-587859053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "2147483646", "-981"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "12:40:451E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "12:40:451E-5 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, 2, :, 4, 0, :, 4, 5, 1, E, -, 5], getTextOffset=0, hasTextAsCharacters=true, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", ";"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "; {getCurrentSegment=[;, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[;], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:7>", "2147483625", "-524245"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483625", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-524245, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"2"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "2 {getCurrentSegment=[2, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[2], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "/Q/b", "377", "262161"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"Hello, World", "261199", "262308"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "abc {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[a, b, c], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "2147483647", "500"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "20:20-01-01"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("20:20-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "20:20-01-01 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 0, :, 2, 0, -, 0, 1, -, 0, 1], getTextOffset=0, hasTextAsCharacters=true, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
}
