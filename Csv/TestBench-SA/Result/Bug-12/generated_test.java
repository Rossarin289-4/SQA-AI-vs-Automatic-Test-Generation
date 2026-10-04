package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\n"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"3"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "<null>"}}, 2), new String[][]{{"getAllowMissingColumnNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"a"}, false), new String[][]{{"withCommentMarker", "java.lang.Character", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\n"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\000"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}, 3), new String[][]{{"format", "java.lang.Object[]", "4"}, {"getDelimiter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withQuoteMode", "org.apache.commons.csv.QuoteMode", "0"}, {"withDelimiter", "char", "6"}, {"withCommentMarker", "java.lang.Character", "7"}, {"withEscape", "java.lang.Character", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"p"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}}, 3), new String[][]{{"withQuote", "char", "1"}, {"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> QuoteChar=< > NullString=<0> RecordSeparator=<p> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null,...#469#623546659", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\n"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3), new String[][]{{"withEscape", "java.lang.Character", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:ddgA+>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"getQuoteMode", "", "3"}, {"withHeader", "java.lang.String[]", "0"}, {"getQuoteMode", "", "2"}, {"print", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "null"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"withHeader", "java.lang.String[]", "1"}, {"withIgnoreSurroundingSpaces", "boolean", "7"}, {"withEscape", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> Escape=<0> SurroundingSpaces:ignored SkipHeaderRecord:true Header:[0, sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=0, getHeader=[0...#487#1663880815", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"withCommentMarker", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> CommentStart=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyL...#462#-90245428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"P"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "c"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<P> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#-373015278", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\uffff"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", " "}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "d"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "D"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "D"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "D"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "E"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "f"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "f"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "f"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"e"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<empty>"}}, 2), new String[][]{{"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<e> NullString=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=e, getHeader=null, getIgnoreEmptyLines=false...#449#200504512", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"4"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<empty>"}}, 2), new String[][]{{"withNullString", "java.lang.String", "6"}, {"withEscape", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"0y1F"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 1), new String[][]{{"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"0y1F SjipXH=aderReco"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 1), new String[][]{{"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> NullString=<\t> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgn...#442#-1883323458", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{" "}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 1), new String[][]{{"withCommentMarker", "java.lang.Character", "6"}, {"isQuoteCharacterSet", "", "2"}, {"getIgnoreSurroundingSpaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"l"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 1), new String[][]{{"withCommentMarker", "java.lang.Character", "6"}, {"isQuoteCharacterSet", "", "2"}, {"getIgnoreSurroundingSpaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2Lnull0x123456789"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<2Lnull0x123456789> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmp...#480#-846382313", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"a"}, false, 3, new String[][]{}, 1), new String[][]{{"getAllowMissingColumnNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"g"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=g, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#-90637441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 1), new String[][]{{"isQuoteCharacterSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{")"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1), new String[][]{{"isQuoteCharacterSet", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> Escape=<)> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=), getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#-52967009", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", ">"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=true, get...#449#-307557262", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"c"}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<c> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=c, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#922141853", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"/"}, false, 15, new String[][]{}, 1), new String[][]{{"getDelimiter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"/"}, false, 14, new String[][]{}, 1), new String[][]{{"getDelimiter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{")"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<)> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=), getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-689037039", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}, 2), new String[][]{{"parse", "java.io.Reader", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{":"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}}, 2), new String[][]{{"getRecordSeparator", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1.12345\r67"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:ra>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<1.12345\r67> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines...#466#-1366234025", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "6"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1\0001.5\000value", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1E-"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", " "}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", " "}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", " "}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#1972213087", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"_"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<_> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=_, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#-1445886785", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 2), new String[][]{{"isEscapeCharacterSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\r"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#-589298350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"P"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<P> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#-373015278", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1196071563", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("955199108", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-358350220", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#-589298350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}), new String[][]{{"withEscape", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > QuoteChar=<m> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getIgnoreEmptyLines=false,...#448#-623720494", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"r"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withEscape", "char", "1"}, {"withRecordSeparator", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > QuoteChar=<r> RecordSeparator=<sample> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, g...#475#1392541640", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#1450043762", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{" "}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#1450043762", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"l"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<l> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#441#353103322", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:7>"}}), new String[][]{{"isQuoteCharacterSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:7>"}}), new String[][]{{"isQuoteCharacterSet", "", "2"}, {"getIgnoreEmptyLines", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"H"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<H> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=H, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-50043181", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\n"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "D"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#-99870145", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"f"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\000"}}), new String[][]{{"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<f> NullString=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=f, getHeader=null, getIgnoreEmptyLines=false...#449#-1188862206", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<0x1F> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, get...#448#-1944757738", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{""}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> NullString=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#440#-39136490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"p"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}), new String[][]{{"withCommentMarker", "java.lang.Character", "6"}, {"isQuoteCharacterSet", "", "2"}, {"withNullString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> CommentStart=<a> NullString=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=a, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=...#453#709588450", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"e"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "0"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "6"}, {"isQuoteCharacterSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"g"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withCommentMarker", "java.lang.Character", "6"}, {"isQuoteCharacterSet", "", "2"}, {"getIgnoreSurroundingSpaces", "", "0"}, {"parse", "java.io.Reader", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}}), new String[][]{{"getQuoteMode", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "l"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "A"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=fa...#456#443130789", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"getNullString", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "f"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}), new String[][]{{"getNullString", "", "1"}, {"withCommentMarker", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=a, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-1058746207", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\n"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}), new String[][]{{"getNullString", "", "1"}, {"withCommentMarker", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<a> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=a, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnor...#469#1517708955", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<1L> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, ...#450#704741623", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:6>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "l"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"getAllowMissingColumnNames", "", "2"}, {"isNullStringSet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\000"}, false, 9, new String[][]{}), new String[][]{{"getAllowMissingColumnNames", "", "2"}, {"isNullStringSet", "", "3"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\uffff"}, false, 9, new String[][]{}), new String[][]{{"getAllowMissingColumnNames", "", "2"}, {"isNullStringSet", "", "3"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\uffff", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"-"}, false, 9, new String[][]{}), new String[][]{{"getAllowMissingColumnNames", "", "2"}, {"isNullStringSet", "", "3"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{","}, false, 9, new String[][]{}), new String[][]{{"getAllowMissingColumnNames", "", "2"}, {"isNullStringSet", "", "3"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(",", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#434#-1762006747", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "0"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"g"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=g, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#-90637441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\uffff"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\uffff"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=true, get...#449#-307557262", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:4>"}, false), new String[][]{{"getCommentMarker", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"E"}, false, 1, new String[][]{}), new String[][]{{"getQuoteCharacter", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\001"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<\001> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=\001, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-1652092575", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"="}, false), new String[][]{{"isQuoteCharacterSet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"parse", "java.io.Reader", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"g"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=g, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-48580453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"E"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}}), new String[][]{{"getRecordSeparator", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"E"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}}), new String[][]{{"getRecordSeparator", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withCommentMarker", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > RecordSeparator=<;> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmpty...#461#-762411185", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"3K"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"withHeader", "java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<3K> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[0, sample, ...#480#487125855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"HN"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"isNullStringSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"NullString=<"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"isNullStringSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"T0x1F"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"T0C1F"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T0C1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"T0CF"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:ra>"}}), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T0CF", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"7"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:ra>"}}), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getHeader", ""}}), new String[][]{{"isEscapeCharacterSet", "", "2"}, {"withCommentMarker", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#443#1073702571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", " "}, {"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}), new String[][]{{"isEscapeCharacterSet", "", "2"}, {"withCommentMarker", "char", "3"}, {"getDelimiter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", " "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1E-5"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1E-5"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1E-5"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSp...#430#293660494", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"getIgnoreEmptyLines", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"getIgnoreSurroundingSpaces", "", "4"}, {"getCommentMarker", "", "1"}, {"parse", "java.io.Reader", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "3"}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", " "}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\000"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\013"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\000"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"E"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<E> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=E, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1695372197", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"e"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<e> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=e, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1913966501", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"S"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<S> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=S, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1522571749", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{";"}, true), new String[][]{{"withHeader", "java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<;> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=;, getEscapeCharacter=null, getHeader=[0, sample, ], getIgnoreEmptyLine...#461#998644813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"a"}, true), new String[][]{{"withHeader", "java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=[0, sample, ], getIgnoreEmptyLine...#461#639823105", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"m"}, true), new String[][]{{"withHeader", "java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<m> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=m, getEscapeCharacter=null, getHeader=[0, sample, ], getIgnoreEmptyLine...#461#752561897", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\000"}, true), new String[][]{{"withHeader", "java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[0, sample, ], getIgnoreEmptyLine...#461#-2061051837", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"="}, true), new String[][]{{"withHeader", "java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<=> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter==, getEscapeCharacter=null, getHeader=[0, sample, ], getIgnoreEmptyLine...#461#301606729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false), new String[][]{{"withDelimiter", "char", "7"}, {"getAllowMissingColumnNames", "", "1"}, {"withRecordSeparator", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> Escape=< > RecordSeparator=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter= , getHeader=null, getIgnoreEmptyLines=f...#453#166868477", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"getAllowMissingColumnNames", "", "5"}, {"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"getAllowMissingColumnNames", "", "5"}, {"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 key 0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"getAllowMissingColumnNames", "", "5"}, {"format", "java.lang.Object[]", "2"}, {"isEscapeCharacterSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}}, 3), new String[][]{{"getAllowMissingColumnNames", "", "5"}, {"format", "java.lang.Object[]", "2"}, {"isEscapeCharacterSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}}, 3), new String[][]{{"getAllowMissingColumnNames", "", "5"}, {"format", "java.lang.Object[]", "2"}, {"isEscapeCharacterSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"H"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<H> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, g...#448#-779910449", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"G"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}, {"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}), new String[][]{{"parse", "java.io.Reader", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"P"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<P> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, g...#448#-470060321", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\n"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}), new String[][]{{"withDelimiter", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> RecordSeparator=<\n> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, g...#448#-69460141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"R"}, false, 4, new String[][]{}), new String[][]{{"withDelimiter", "char", "7"}, {"withEscape", "char", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "P"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b02", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"P"}, false), new String[][]{{"isCommentMarkerSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "S"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=true, get...#449#-307557262", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 1), new String[][]{{"withCommentMarker", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-1013098717", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}), new String[][]{{"withCommentMarker", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-1013098717", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}, 3), new String[][]{{"withCommentMarker", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgno...#444#-1013098717", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"Y"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "W"}, {"org.apache.commons.csv.CSVFormat", "getHeader", ""}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}), new String[][]{{"getIgnoreSurroundingSpaces", "", "0"}, {"getQuoteCharacter", "", "2"}, {"withAllowMissingColumnNames", "boolean", "2"}, {"parse", "java.io.Reader", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSp...#430#293660494", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1), new String[][]{{"getNullString", "", "5"}, {"withEscape", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getIgnoreEmpty...#463#-801608363", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1), new String[][]{{"withDelimiter", "char", "5"}, {"withEscape", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<0> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=0, getHeader=null, getIgnoreEmpty...#463#-642781931", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withDelimiter", "char", "5"}, {"withEscape", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=0, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurr...#438#629274015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"withDelimiter", "char", "3"}, {"getHeader", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"D"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1), new String[][]{{"withDelimiter", "char", "3"}, {"getHeader", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"r"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "l"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "m"}}), new String[][]{{"getAllowMissingColumnNames", "", "7"}, {"isNullStringSet", "", "6"}, {"getDelimiter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "l"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "y"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "P"}}, 2), new String[][]{{"getAllowMissingColumnNames", "", "7"}, {"isNullStringSet", "", "6"}, {"getDelimiter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\n"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1954572869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\n"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"E"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}}), new String[][]{{"getCommentMarker", "", "6"}, {"isNullStringSet", "", "3"}, {"isEscapeCharacterSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"E"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}}, 2), new String[][]{{"getCommentMarker", "", "6"}, {"isNullStringSet", "", "3"}, {"isEscapeCharacterSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "Delimiter=<"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"g"}, false, 0, null, 3), new String[][]{{"withAllowMissingColumnNames", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=g, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnor...#443#-1072763162", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"m"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "`"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3), new String[][]{{"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "h"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "true"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "tru"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "g"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "-tru"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "g"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\r"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{":"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", " "}}), new String[][]{{"withCommentMarker", "java.lang.Character", "4"}, {"getIgnoreEmptyLines", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#-1349771301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "12:30:H45"}}, 2), new String[][]{{"withAllowMissingColumnNames", "boolean", "3"}, {"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=fals...#453#-27185832", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "12:30:H45"}}, 2), new String[][]{{"withAllowMissingColumnNames", "boolean", "3"}, {"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpa...#428#2075102210", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "12:30:H45"}}, 2), new String[][]{{"withAllowMissingColumnNames", "boolean", "3"}, {"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:true {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpa...#428#603328514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "12:30:H45"}}, 2), new String[][]{{"withAllowMissingColumnNames", "boolean", "7"}, {"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=fals...#453#-2058022568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#302207931", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingS...#431#520802235", SearchInputFactory_scaffolding.receiverState());
 }
}
