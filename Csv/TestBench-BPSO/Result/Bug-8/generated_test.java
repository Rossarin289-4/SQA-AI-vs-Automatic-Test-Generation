package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false), new String[][]{{"withEscape", "java.lang.Character", "0"}, {"withIgnoreSurroundingSpaces", "boolean", "5"}, {"withRecordSeparator", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<\000> NullString=<1.5d> RecordSeparator=< > SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=\000, getHeader=null, getIgnoreEmptyLines=...#430#1754716815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"\000"}, false), new String[][]{{"parse", "java.io.Reader", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "\r"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"A"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}), new String[][]{{"parse", "java.io.Reader", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\r"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\000"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}, 1), new String[][]{{"parse", "java.io.Reader", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"\r"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "TITLE3"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "m"}}), new String[][]{{"parse", "java.io.Reader", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"8"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\r"}}, 1), new String[][]{{"getHeader", "", "4"}, {"parse", "java.io.Reader", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"i"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}, 2), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"parse", "java.io.Reader", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{" "}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "X"}}, 3), new String[][]{{"withIgnoreEmptyLines", "boolean", "7"}, {"withQuoteChar", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<\000> CommentStart=< > EmptyLines:ignored SkipHeaderRecord:false {getCommentStart= , getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundin...#405#531807520", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3), new String[][]{{"withHeader", "java.lang.String[]", "1"}, {"withEscape", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> RecordSeparator=< > SkipHeaderRecord:false Header:[0, sample] {getCommentStart=null, getDelimiter=\000, getEscape=a, getHeader=[0, sample], getIgnoreEmptyLines=false, getIgnoreSu...#414#-102842676", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}}), new String[][]{{"withCommentStart", "java.lang.Character", "5"}, {"parse", "java.io.Reader", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\000"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "TITLETitle"}}), new String[][]{{"withCommentStart", "char", "4"}, {"parse", "java.io.Reader", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<a> SkipHeaderRecord:false {getCommentStart=a, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-95225964", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"0.5Hello, World"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 1), new String[][]{{"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<0.5Hello, World> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false...#407#372979796", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "X"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<1> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=1, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-328183228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1), new String[][]{{"withCommentStart", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getCommentStart=0, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#610367220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"F"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<F> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=F, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#1758623076", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"f"}, false, 0, null, 1), new String[][]{{"withCommentStart", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<f> CommentStart=<\000> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#387#-866885813", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#371#-1362656138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"k"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<k> SkipHeaderRecord:false {getCommentStart=k, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#199037396", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1.1c2345678"}, false, 0, null, 1), new String[][]{{"getRecordSeparator", "", "7"}, {"isCommentingEnabled", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", ">"}}, 2), new String[][]{{"withEscape", "char", "0"}, {"getRecordSeparator", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 0, null, 2), new String[][]{{"withQuotePolicy", "org.apache.commons.csv.Quote", "0"}, {"getDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"N"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "9"}}, 3), new String[][]{{"format", "java.lang.Object[]", "2"}, {"withDelimiter", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> Escape=<N> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=N, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-828303484", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"/"}, false, 0, null, 1), new String[][]{{"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"<"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "n"}}, 2), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<<> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=<, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteChar...#362#944499872", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"8"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<8> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=8, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-1064236892", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "8"}}, 3), new String[][]{{"withHeader", "java.lang.String[]", "7"}, {"withEscape", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SurroundingSpaces:ignored SkipHeaderRecord:false Header:[, a] {getCommentStart=null, getDelimiter=\000, getEscape=0, getHeader=[, a], getIgnoreEmptyLines=false, getIgnoreSurround...#410#-2083588968", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", ","}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\uffff"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}}, 3), new String[][]{{"getRecordSeparator", "", "6"}, {"withCommentStart", "java.lang.Character", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getCommentStart= , getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#139545844", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"x"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<x> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=x, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1830945242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"="}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2), new String[][]{{"withIgnoreEmptyLines", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<=> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter==, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1442002905", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}, 2), new String[][]{{"getNullString", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}}, 2), new String[][]{{"withCommentStart", "char", "7"}, {"getSkipHeaderRecord", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentStart", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}, 1), new String[][]{{"getIgnoreEmptyLines", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "t"}}, 3), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "C"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true, getNul...#389#-1335807372", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"d"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "4"}}, 2), new String[][]{{"withQuoteChar", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<d> QuoteChar=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=d, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#-646468557", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{":"}, false, 0, null, 2), new String[][]{{"withIgnoreEmptyLines", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<:> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=:, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-883132194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}, 1), new String[][]{{"withEscape", "java.lang.Character", "6"}, {"isEscaping", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}, 2), new String[][]{{"withEscape", "java.lang.Character", "6"}, {"withRecordSeparator", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=a, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#388#667191192", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", ";"}, {"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "\uffff"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "N"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<i> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#-1326215541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "5"}}, 2), new String[][]{{"withQuotePolicy", "org.apache.commons.csv.Quote", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape= , getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#1250409045", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}, 3), new String[][]{{"withSkipHeaderRecord", "boolean", "2"}, {"isQuoting", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", " "}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{";"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<;> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#2027878603", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "C"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "m"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#372#-963972300", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"0.5"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<0.5> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullSt...#385#-219871284", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<\uffff> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=\uffff, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-1996351740", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"getRecordSeparator", "", "0"}, {"getNullString", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:,key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"withSkipHeaderRecord", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"?"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<?> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=?, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1287717976", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "D"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"5"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<5> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=5,...#375#-1951897539", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "m"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"W"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "U"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<W> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=W, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-652749352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{";"}, false), new String[][]{{"getIgnoreEmptyLines", "", "2"}, {"withNullString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<;> NullString=<sample> SkipHeaderRecord:false {getCommentStart=;, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=fals...#398#1789768335", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteChar...#362#1647502880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "c"}}), new String[][]{{"getIgnoreEmptyLines", "", "3"}, {"getQuotePolicy", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"T"}, false), new String[][]{{"withEscape", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> QuoteChar=<T> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullSt...#381#-540300947", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"a"}, false), new String[][]{{"isCommentingEnabled", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}}), new String[][]{{"format", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withCommentStart", "java.lang.Character", "7"}, {"getIgnoreEmptyLines", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<b> SkipHeaderRecord:false {getCommentStart=b, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#2081684020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"`"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<`> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=`, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1195976618", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}), new String[][]{{"getQuotePolicy", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "[1,2\\true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:N>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true, getNul...#389#-1335807372", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{">"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<>> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=>, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true...#396#-1522287262", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"withQuoteChar", "char", "1"}, {"withEscape", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> QuoteChar=< > EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=a, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpace...#399#496542456", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"k"}, false), new String[][]{{"getNullString", "", "1"}, {"getIgnoreEmptyLines", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"p"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}), new String[][]{{"getIgnoreSurroundingSpaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"u"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}), new String[][]{{"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> CommentStart=<u> SkipHeaderRecord:false {getCommentStart=u, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#387#-1085756853", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"8"}, false, 4, new String[][]{}), new String[][]{{"getHeader", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-358350220", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withCommentStart", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getCommentStart=0, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#610367220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > CommentStart=<m> SkipHeaderRecord:true {getCommentStart=m, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null...#375#-1848688660", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"<"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "l"}}), new String[][]{{"withEscape", "java.lang.Character", "3"}, {"getEscape", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}, {"org.apache.commons.csv.CSVFormat", "validate", ""}}), new String[][]{{"getIgnoreEmptyLines", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}}), new String[][]{{"withCommentStart", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:true {getCommentStart=0, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null...#375#-1901556814", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withHeader", "java.lang.String[]", "4"}, {"getIgnoreEmptyLines", "", "7"}, {"getIgnoreEmptyLines", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "Q"}}), new String[][]{{"isNullHandling", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "9"}}), new String[][]{{"getSkipHeaderRecord", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentStart", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"close", "", "5"}, {"getCurrentLineNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"NullSmring=<"}, false), new String[][]{{"withCommentStart", "char", "1"}, {"isQuoting", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}}), new String[][]{{"withCommentStart", "char", "2"}, {"withEscape", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> CommentStart=<a> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=a, getDelimiter=\000, getEscape=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurround...#409#931433092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"C"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<C> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=C, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#965593776", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"getNullString", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}), new String[][]{{"withNullString", "java.lang.String", "7"}, {"isNullHandling", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"9"}, false), new String[][]{{"isQuoting", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"d"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<d> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=d, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-845678926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"a"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#381#-1717553332", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{".:.5"}, false), new String[][]{{"getSkipHeaderRecord", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"c"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}), new String[][]{{"withEscape", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<c> Escape=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=c, getEscape= , getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#152066308", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1871433099", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"getCurrentLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{" "}, true), new String[][]{{"getIgnoreSurroundingSpaces", "", "7"}, {"withHeader", "java.lang.String[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false Header:[] {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=[], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#372#-705768588", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"getDelimiter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"m"}, false), new String[][]{{"getDelimiter", "", "6"}, {"getCommentStart", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\037"}, false), new String[][]{{"withEscape", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\037> Escape=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\037, getEscape= , getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-28373884", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "147483648"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-459062183", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"."}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "'"}}), new String[][]{{"parse", "java.io.Reader", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteChar...#362#1647502880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null...#372#-1209310937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "6"}, {"withRecordSeparator", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#384#1685085284", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"getNullString", "", "7"}, {"withDelimiter", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:true {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteChar...#362#-445418976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"x"}, false), new String[][]{{"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<x> NullString=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, ge...#385#-347904046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}), new String[][]{{"withDelimiter", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"/"}, true), new String[][]{{"withIgnoreEmptyLines", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=</> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=/, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1711030392", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"unull"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}), new String[][]{{"getHeader", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}, {"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "1"}, {"getIgnoreSurroundingSpaces", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "\r"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}), new String[][]{{"getRecords", "", "7"}, {"contains", "java.lang.Object", "3"}, {"addAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "t"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}), new String[][]{{"isCommentingEnabled", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"!"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<!> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=!, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#392465476", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false), new String[][]{{"withEscape", "char", "3"}, {"withIgnoreSurroundingSpaces", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> RecordSeparator=<a,b,c> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false,...#396#813560926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<b> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=b, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#175148846", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"getRecords", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "N"}}), new String[][]{{"withNullString", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<sample> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStrin...#383#-1762542461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}}), new String[][]{{"withEscape", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#378#1754059822", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"k"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"getCommentStart", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}), new String[][]{{"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000a", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}), new String[][]{{"withQuotePolicy", "org.apache.commons.csv.Quote", "1"}, {"withIgnoreSurroundingSpaces", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true, getNul...#392#104461638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"N"}, false), new String[][]{{"withHeader", "java.lang.String[]", "5"}, {"withEscape", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> CommentStart=<N> SkipHeaderRecord:false Header:[0, sample, ] {getCommentStart=N, getDelimiter=\000, getEscape=0, getHeader=[0, sample, ], getIgnoreEmptyLines=false, getIgnoreSurr...#414#1042540670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"'"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}, {"getIgnoreEmptyLines", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<b> SkipHeaderRecord:false {getCommentStart=b, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#2081684020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"/"}, false), new String[][]{{"parse", "java.io.Reader", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"A"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\016"}}), new String[][]{{"isCommentingEnabled", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"0"}, true), new String[][]{{"withSkipHeaderRecord", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\uffff"}, true), new String[][]{{"withCommentStart", "char", "2"}, {"withRecordSeparator", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\uffff> CommentStart=<a> RecordSeparator=<a> SkipHeaderRecord:false {getCommentStart=a, getDelimiter=\uffff, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=fals...#394#1138706766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}, {"org.apache.commons.csv.CSVFormat", "validate", ""}}, 1), new String[][]{{"isClosed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"X"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "0"}}), new String[][]{{"getEscape", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"6"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<6> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=6, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1158523350", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:<>"}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"l"}, false), new String[][]{{"getQuoteChar", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"withDelimiter", "char", "6"}, {"withHeader", "java.lang.String[]", "2"}, {"withQuotePolicy", "org.apache.commons.csv.Quote", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false Header:[sample, , a] {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=[sample, , a], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, g...#397#-957171420", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"."}, true), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<.> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=., getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#946867142", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"withQuoteChar", "char", "5"}, {"withQuoteChar", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false Header:[a] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[a], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNull...#384#-224897609", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteChar...#362#1647502880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"8"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<8> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=8, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#137695578", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\016"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:N>"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "t"}}), new String[][]{{"getNullString", "", "0"}, {"withQuoteChar", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> RecordSeparator=<\016> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=fals...#391#1110281975", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"H"}, true), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<H> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=H, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true, getNul...#389#-1718674460", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 2), new String[][]{{"withQuoteChar", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1008782699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"\uffff"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > CommentStart=<\uffff> SkipHeaderRecord:false {getCommentStart=\uffff, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#234040852", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withEscape", "char", "7"}, {"getNullString", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"parse", "java.io.Reader", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "A"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false Header:[sample, , a] {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=[sample, , a], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, g...#394#-382902858", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#367#-401634032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\000"}}), new String[][]{{"getHeaderMap", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:N>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:ky,>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}, 3), new String[][]{{"getEscape", "", "7"}, {"isEscaping", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"parse", "java.io.Reader", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:24>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\r"}}), new String[][]{{"getRecords", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{" "}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\n"}}), new String[][]{{"getDelimiter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "o"}, {"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"N"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}), new String[][]{{"withEscape", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> QuoteChar=<N> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=a, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullSt...#381#-1196182719", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"isCommentingEnabled", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\r"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 6, new String[][]{}), new String[][]{{"withEscape", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<a> CommentStart=<b> SkipHeaderRecord:false {getCommentStart=b, getDelimiter= , getEscape=a, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullSt...#384#25440722", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\013"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"getIgnoreEmptyLines", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false), new String[][]{{"getQuotePolicy", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"/"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "N"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=</> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=/, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#1109251332", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 6, new String[][]{}), new String[][]{{"withRecordSeparator", "char", "7"}, {"withEscape", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<0> RecordSeparator=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#388#-850328294", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{":"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "u"}, {"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}, 3), new String[][]{{"withQuoteChar", "java.lang.Character", "6"}, {"withQuotePolicy", "org.apache.commons.csv.Quote", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<:> QuoteChar=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=:, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#433379353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"!"}, false), new String[][]{{"getDelimiter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false), new String[][]{{"getNullString", "", "3"}, {"withHeader", "java.lang.String[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[sample, , a] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[sample, , a], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, g...#394#679520694", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "20u0-01l-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "1"}, {"getIgnoreEmptyLines", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"`"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:4>"}}), new String[][]{{"isCommentingEnabled", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}), new String[][]{{"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-1073741824>"}}, 3), new String[][]{{"getQuotePolicy", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[a] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[a], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, ge...#372#-1473660076", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:5>"}}), new String[][]{{"withNullString", "java.lang.String", "4"}, {"withIgnoreEmptyLines", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=, g...#373#-913503265", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\001"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getCommentStart", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"+"}, false, 5, new String[][]{}, 1), new String[][]{{"withCommentStart", "char", "2"}, {"isQuoting", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 3), new String[][]{{"getCommentStart", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{")"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}), new String[][]{{"withDelimiter", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> Escape=<)> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=), getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-9268412", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"tru\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withRecordSeparator", "java.lang.String", "2"}, {"withQuotePolicy", "org.apache.commons.csv.Quote", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<tru\n> RecordSeparator=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=...#405#1288578795", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"9"}, false), new String[][]{{"parse", "java.io.Reader", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"withQuoteChar", "char", "1"}, {"withIgnoreSurroundingSpaces", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#45446957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"/"}, true, 0, null, 3), new String[][]{{"isQuoting", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "<null>"}}, 3), new String[][]{{"withCommentStart", "char", "2"}, {"withCommentStart", "java.lang.Character", "2"}, {"withQuoteChar", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> CommentStart=<a> SkipHeaderRecord:false {getCommentStart=a, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#387#2017670699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "d"}}, 3), new String[][]{{"isEscaping", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}), new String[][]{{"withIgnoreEmptyLines", "boolean", "0"}, {"withNullString", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > NullString=<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=, g...#373#-1706941537", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"y"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<y> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=y, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-826952292", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
}
