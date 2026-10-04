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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"227483648", "2147483647", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "2359297", "62"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1234567890123456789012345678:02147483748"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:1>", "17330", "63477"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "62", "262143"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "Title", "1073479680", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "1073742336"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "e"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[e, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "8519722", "8665"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "17039360", "-246"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#417#-703304135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "532676617", "-2130705895"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "-1071644672", "31"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "aaaaaaaaaaaabaaaaaaaaaa-aaaaaa"}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "aaaaaaaaaaaabaaaaaaaaaa-aaaaaa {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[a, a, a, a, a, a, a, a, a, a, a, a, b, a, a, a, a, a, a, a,.., getTextOffset=...#237#-1780058719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:2>", "-1073739822", "999"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1116#-703116461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "", "-2048", "2099150"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#2099271#1629745054", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1.5 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[-, 1, ., 5], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:3>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:3>", "2147483647", "778199"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "262164", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "{\"a!:1}", "-2147483647", "-131066"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"264212"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 {getCurrentSegment=[3, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"-17330"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "W"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"-8519965"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "w"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[w, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#2102455501", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "w {getCurrentSegment=[w, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[w], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"f"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:3>", "-65533", "-16360"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1073741823"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#318#2005619250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "--"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-- {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[-, -], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.5fHello,!World", "1073742387", "2143289305"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "12", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"16777716"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "e"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "e {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[e], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"20"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "-11E-5", "999", "2359297"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000 {getCurrentSegment=?, getCurrentSegmentSize=20, getTextBuffer=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000], getTextOffset=0, hasTextAsCharacters=true, size=20}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"3"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:3>", "1065353203", "-1073741824"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "2002", "268699668"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "1073741823", "-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "1073742336", "0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", ";a>b</a>", "1074003988", "1073741814"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "8"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "8 {getCurrentSegment=[8, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[8], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "12:0:45", "0", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"2L", "8611", "532676617"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:3>", "1065353203", "253911"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "16908641"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"h"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "1", "10"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\uffff"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"Hello,!World"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello,!World {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[H, e, l, l, o, ,, !, W, o, r, l, d], getTextOffset=0, hasTextAsC...#224#2097130292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-133955564", "1065353139"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1", "1073741823", "134479831"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"[1,2]", "2147483647", "65525"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "131072"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "1065353203", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"a"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a {getCurrentSegment=[a, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[a], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"262400"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"2130706406"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "253866", "1082343"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "http://example.con/a?b=ci"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "/ab"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"A"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Hello9,!World"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{">"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"a.ull", "262199", "-262162"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "508", "262164"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\037"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "\037 {getCurrentSegment=[\037, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\037], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"-15727641"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "", "2147483647", "262144"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "2048"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "\037-1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:1>", "262167", "17330"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "786433"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=786433, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2130706407"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"T"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "l"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"abca b"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "abca b {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[a, b, c, a,  , b], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"3"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "3 {getCurrentSegment=[3, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"\"ba b", "1065353203", "17039360"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-0.0+1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "2146959360"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "-2147483648", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaa`aaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "aaaaaaaaaaaaa`aaaaaaaaaaaaaaaa {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[a, a, a, a, a, a, a, a, a, a, a, a, a, `, a, a, a, a, a, a,.., getTextOffset=...#237#1569506733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-1073741824", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "131052", "17330"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "262144", "126955"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "4098"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 {getCurrentSegment=[3, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"+"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "536871168", "-999"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "2359297"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"131094"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:1>", "-1", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "0000"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0000 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0, 0, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"3"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "3 {getCurrentSegment=[3, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{".5", "2130706407", "17330"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-24", "262145"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "8622", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "95", "-262144", "-50"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
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
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "\000 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\000], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "1049575", "1025"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "999", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2049", "1065353203"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.5f", "0", "-39"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "1000", "1049575"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "-17", "16777216"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"abca b", "262164", "2002"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "262135", "262145"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"262133"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "-131066"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "abc", "999", "1065353203"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", new String[]{"int"}, new String[]{"524328"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<empty>", "1001", "1065353235"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "131072"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"", "262103", "2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "2147483748"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:1>", "2049", "-262164"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-262164", "-524328"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"7"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "7 {getCurrentSegment=[7, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[7], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:1>", "1065353203", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"3"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "3 {getCurrentSegment=[3, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "10", "253911"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "2147483647", "131051"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:2>", "-2130706407", "-1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "264212", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("264212", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", " "}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "  {getCurrentSegment=[ , \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[ ], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "-2049", "8665"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-2048"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"t"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "t {getCurrentSegment=[t, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[t], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "2143289344", "16777716"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:0>", "-1593835479", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "2147483647", "-2"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "2130706407"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2130706407, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"f"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "f {getCurrentSegment=[f, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[f], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"\uffff"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "262143"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=262143, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<null>", "1065353203", "63"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "4004", "2147483647"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"."}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "TITL"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-1593835479"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "1049575"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1049575, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "abca babc"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abca babc", String.valueOf(actual));
  assertEquals("receiver state after the call", "abca babc {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[a, b, c, a,  , b, a, b, c], getTextOffset=0, hasTextAsCharacters=true, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\u00e9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\u00e9 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[\u00e9], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "264212", "16777716"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "10", "62"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2049"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2049, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1001, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "262177"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262177", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#423158726", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "-0", "262164", "1025"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<null>", "264212", "1025"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "e"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "3 {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[3], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "262164"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "1073742380", "-2048"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<null>", "1049575", "34660"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=-2048, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"524292"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=524292, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<empty>", "63", "1065353227"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#113235541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"17039360"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"abc", "-2147483648", "65535"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:5>", "-524288", "63"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "126955", "-524288"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-524288, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"-262164"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\ufffe"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\ufffe, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[6, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "---1", "-262137", "17072128"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "2048"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-1043"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-1043, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1234567890123456789012345678:02147483748"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, :, 0, 2, 1, 4, 7, 4, 8, 3, 7, 4, 8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1234567890123456789012345678:02147483748 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, ...#278#1435690312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1", "16777684", "17330"}, {"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "1"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "abca,b"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[a, b, c, a, ,, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "abca,b {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[a, b, c, a, ,, b], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "T"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "T\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-1664061458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", " "}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "  {getCurrentSegment=?, getCurrentSegmentSize=1, getTextBuffer=[ ], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-2147483648, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#113235541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\uffff {getCurrentSegment=[\uffff, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\uffff], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "Hello,!WW\u00e9orld", "262145", "258037"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "17281", "-29"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17281", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-29, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "e"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[e, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-440519109", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[e, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "TI.TLE"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TI.TLE {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[T, I, ., T, L, E], getTextOffset=0, hasTextAsCharacters=true, size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"2521\"44"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-2147483648"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDecimal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2521\"44 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, 5, 2, 1, \", 4, 4], getTextOffset=0, hasTextAsCharacters=true, size...#203#-591387996", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"-262139"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-196628"}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "2363453"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-262139, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "262113"}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "32825"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=32825, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"1049575"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=1049575, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "- {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[-], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"-1065353234"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\037"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\037, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#2077818485", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "\037 {getCurrentSegment=[\037, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\037], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{",1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", ",1 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[,, 1], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "22483648I"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[2, 2, 4, 8, 3, 6, 4, 8, I]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "22483648I {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 2, 4, 8, 3, 6, 4, 8, I], getTextOffset=0, hasTextAsCharacters=true, size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "131051", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:1>", "-2147483648", "1049620"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#1049741#-256064964", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "F"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[F, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#-1718165668", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "F {getCurrentSegment=[F, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[F], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "T?tle"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "T?tle {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[T, ?, t, l, e], getTextOffset=0, hasTextAsCharacters=true, size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "999"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=999, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[n, u, l, l]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "null {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[n, u, l, l], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "2147483647", "62"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#-905406866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "131051", "-2130706385"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:1>", "-1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=-2130706385, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-131066", "5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "17390"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17390", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=17390, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1.\re300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1.\re300 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, ., \r, e, 3, 0, 0], getTextOffset=0, hasTextAsCharacters=true, size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "1n.123", "-2147483648", "978"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{" "}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:2>", "524810", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "  {getCurrentSegment=[ , \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[ ], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1i0"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[1, i, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1i0 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[1, i, 0], getTextOffset=0, hasTextAsCharacters=true, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Hello,!Wormd"}, {"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello,!Wormd", String.valueOf(actual));
  assertEquals("receiver state after the call", "Hello,!Wormd {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[H, e, l, l, o, ,, !, W, o, r, m, d], getTextOffset=0, hasTextAsCharacters=true, size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"http://examole.com/a?bc"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "-262132", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "http://examole.com/a?bc {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[h, t, t, p, :, /, /, e, x, a, m, o, l, e, ., c, o, m,...#261#-878801201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:2>", "1899", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1899", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "java.lang.String,int,int", "He+llo, World", "-535822336", "17039360"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-2048"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-2048, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "-24"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-24, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "131072", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "00"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "00 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[0, 0], getTextOffset=0, hasTextAsCharacters=true, size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "1E-5Hello,!World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1E-5Hello,!World {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[1, E, -, 5, H, e, l, l, o, ,, !, W, o, r, l, d], getTextOffs...#240#-63219352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "I"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[I]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "I {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[I], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "-2147483648", "17330"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-1593835502"}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "2130706407", "500"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1593835502", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "}"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", "}\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000...#378#880084942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "finishCurrentSegment", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", "char[],int,int", "<sample:0>", "2147483646", "535822336"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"2147483748", "-1593835477", "2002"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "toString", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2130706444"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2130706444, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2147483647", "0"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", "int", "1065353203"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "2147493748"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147493748 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[2, 1, 4, 7, 4, 9, 3, 7, 4, 8], getTextOffset=0, hasTextAsCharacter...#216#-1463316930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2049"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2049, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\037"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[\037, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "\000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "\000 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[\000], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithEmpty", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "D"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=[D, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{".5PT1H", "978", "-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1.5 {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[-, 1, ., 5], getTextOffset=0, hasTextAsCharacters=true, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"131051"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("receiver state after the call", " {getCurrentSegment=?, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"4"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "4 {getCurrentSegment=[4, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[4], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "http://fxample.com/a?b=c"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "http://fxample.com/a?b=c {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[h, t, t, p, :, /, /, f, x, a, m, p, l, e, ., c, o, m...#262#1087292019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentAndReturn", "int", "262143"}}, 3);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "emptyAndGetCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "hasTextAsCharacters", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#800171926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"char"}, new String[]{"0"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {getCurrentSegment=[0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[0], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "append", new String[]{"java.lang.String", "int", "int"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2143289282", "999"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "expandCurrentSegment", new String[]{"int"}, new String[]{"-2048"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithCopy", "char[],int,int", "<sample:5>", "2147483646", "-21"}, {"com.fasterxml.jackson.core.util.TextBuffer", "size", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", new String[]{"java.lang.String"}, new String[]{"214748364i8"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "214748364i8 {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[2, 1, 4, 7, 4, 8, 3, 6, 4, i, 8], getTextOffset=0, hasTextAsCharacters=true, size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "2147483647"}, {"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=2147483647, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char[],int,int", "<sample:0>", "2147483647", "-2143289344"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "-8665", "-2002"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "500"}, {"com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegmentSize", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getCurrentSegment", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "append", "char", "_"}}, 1);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[_, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000...#600#143478453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "_ {getCurrentSegment=[_, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=1, getTextBuffer=[_], getTextOffset=0, hasTextAsCharacters=true, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "resetWithShared", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "2049", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "contentsAsArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=0, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "getTextOffset", ""}, {"com.fasterxml.jackson.core.util.TextBuffer", "setCurrentLength", "int", "-22"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {getCurrentSegment=!ArrayIndexOutOfBoundsException, getCurrentSegmentSize=-22, getTextBuffer=[], getTextOffset=0, hasTextAsCharacters=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.util.TextBuffer", "com.fasterxml.jackson.core.util.TextBuffer", "ensureNotShared", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.util.TextBuffer", "resetWithString", "java.lang.String", "Hello, World"}, {"com.fasterxml.jackson.core.util.TextBuffer", "releaseBuffers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Hello, World {getCurrentSegment=[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000,.., getCurrentSegmentSize=0, getTextBuffer=[H, e, l, l, o, ,,  , W, o, r, l, d], getTextOffset=0, hasTextAsC...#224#549412726", SearchInputFactory_scaffolding.receiverState());
 }
}
