package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "2"}}), new String[][]{{"withCommentMarker", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#430#1696201568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\r"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"A"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\r"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:6>"}}), new String[][]{{"withHeader", "java.lang.String[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<A> SkipHeaderRecord:false Header:[sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample], getHeaderComme...#463#-229498966", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=[1], getIgn...#450#-1030582712", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\ufffe"}}, 2), new String[][]{{"withEscape", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"B"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}}), new String[][]{{"format", "java.lang.Object[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c\000-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<i:-2>"}, {"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"d"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 2), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000cd", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-24>"}}), new String[][]{{"getQuoteCharacter", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false), new String[][]{{"print", "java.lang.Appendable", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}), new String[][]{{"withHeaderComments", "java.lang.Object[]", "6"}, {"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}), new String[][]{{"withQuote", "java.lang.Character", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 1), new String[][]{{"withQuoteMode", "org.apache.commons.csv.QuoteMode", "5"}, {"withRecordSeparator", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=< > SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, ge...#477#646992286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"u"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "N"}}), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "7"}, {"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"?"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}}), new String[][]{{"format", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\r"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"X"}, false), new String[][]{{"format", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1.1"}, false, 0, null, 3), new String[][]{{"isNullStringSet", "", "6"}, {"withCommentMarker", "java.lang.Character", "3"}, {"withIgnoreEmptyLines", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> NullString=<1.1> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null...#479#437312051", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "_"}}), new String[][]{{"withQuote", "char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 1), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\uffff\uffff\000true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withEscape", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > QuoteChar=<1> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHeaderComments=null, ge...#450#1947305420", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\r"}}, 2), new String[][]{{"getCurrentLineNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}), new String[][]{{"isCommentMarkerSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"x"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}}, 3), new String[][]{{"getIgnoreHeaderCase", "", "6"}, {"parse", "java.io.Reader", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"gO"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"CommetStart=<"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:3>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#439#-2031657226", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 3), new String[][]{{"getSkipHeaderRecord", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"."}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}, 3), new String[][]{{"isEscapeCharacterSet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{">"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<null>"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<>> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=>, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-295557092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"7"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "."}}, 1), new String[][]{{"getDelimiter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"N"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<N> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=N, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#445#-1516007044", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#450#305329965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "7"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{";"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<;> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=;, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#112825158", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "[1,2]"}, {"org.apache.commons.csv.CSVPrinter", "close", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}}, 3), new String[][]{{"isCommentMarkerSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"k"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<k> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=k, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#445#-165054346", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"="}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "0"}}, 2), new String[][]{{"getIgnoreEmptyLines", "", "5"}, {"getIgnoreSurroundingSpaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "X"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:2>"}}, 3), new String[][]{{"withEscape", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-1726626212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 3), new String[][]{{"getCommentMarker", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getSkipHeaderRecord", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"9"}, false, 0, null, 2), new String[][]{{"isCommentMarkerSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "l"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "TITLE"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<d:3.0>"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}, {"org.apache.commons.csv.CSVPrinter", "close", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "m"}}, 1), new String[][]{{"withDelimiter", "char", "1"}, {"withIgnoreEmptyLines", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgn...#448#248708279", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getQuoteMode", "", "5"}, {"getQuoteMode", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1.52147483648"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<1.52147483648> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=nul...#468#407175976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"."}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "a"}}, 2), new String[][]{{"withRecordSeparator", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<.> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=., getHeader=null, getHeaderComments=nu...#456#-35049340", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "A"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{">"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<>> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#666653996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "7"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:3>"}}, 3), new String[][]{{"withQuote", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEm...#442#-1054898443", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"3"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<3> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#7334624", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"X"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<X> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=X, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#944702812", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "<"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\016"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "b"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<\016> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=\016, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#1709699612", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVPrinter", "getOut", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"g"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\n"}}, 1), new String[][]{{"getHeaderComments", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:4>"}}, 2), new String[][]{{"getAllowMissingColumnNames", "", "1"}, {"getHeaderComments", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"12;3/:45"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<12;3/:45> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=nul...#463#189559014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "L"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\001"}}, 1), new String[][]{{"getCurrentLineNumber", "", "0"}, {"getRecords", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]], CSVRecord [comment=null, mapping=null, recordNumber=2, values=[b]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "g"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withIgnoreHeaderCase", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<b> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=b, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#309775974", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, null, 2), new String[][]{{"getRecordSeparator", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"f"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<f> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#-1197703124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"a').5"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVPrinter", "println", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#431#-1279642253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "B"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false), new String[][]{{"withEscape", "java.lang.Character", "2"}, {"withIgnoreEmptyLines", "boolean", "7"}, {"getHeaderComments", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1234567890012345678901234567890"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<1234567890012345678901234567890> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#504#98034088", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#431#-1035827440", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}), new String[][]{{"isQuoteCharacterSet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\uffff"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#-1479862432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "X"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"getSkipHeaderRecord", "", "7"}, {"getQuoteMode", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}, {"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"c"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}), new String[][]{{"withHeader", "java.lang.String[]", "5"}, {"withCommentMarker", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<c> CommentStart=<a> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=a, getDelimiter=\000, getEscapeCharacter=null, getHeader=[0, s...#486#491525336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:6>"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "."}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<b> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=b, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#309775974", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVPrinter", "flush", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"X"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<X> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#-442521408", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"b"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<b> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=b, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#1421725852", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"h"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"getCommentMarker", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "7"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample], getHeaderComments=null, getI...#452#-616225828", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"A"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"parse", "java.io.Reader", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "3"}, {"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withEscape", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-963389348", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"2"}, false, 2, new String[][]{}), new String[][]{{"getDelimiter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withEscape", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getHeaderComments=null, getIgnoreEmptyLin...#437#1565652490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"A"}, false), new String[][]{{"withCommentMarker", "java.lang.Character", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}), new String[][]{{"withSkipHeaderRecord", "boolean", "7"}, {"getQuoteCharacter", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"D"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<D> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=D, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#488657446", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "println", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"getRecordSeparator", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:5>"}}), new String[][]{{"getIgnoreHeaderCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[sample, , a] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample, , a], getHeaderComments=...#462#1021072190", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"E"}, false), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"withIgnoreHeaderCase", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", ")"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<sample:8>"}, {"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "1.5cTITLE"}}), new String[][]{{"appendCodePoint", "int", "5"}, {"insert", "int,char[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"getCommentMarker", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"PaT1H"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<PaT1H> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ...#457#-20329556", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<empty>"}}), new String[][]{{"append", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("2\000key\0000Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}), new String[][]{{"withRecordSeparator", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#245437164", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}), new String[][]{{"getAllowMissingColumnNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"D"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:0>"}}), new String[][]{{"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}), new String[][]{{"getCommentMarker", "", "4"}, {"print", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"x"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:5>"}}), new String[][]{{"getSkipHeaderRecord", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withRecordSeparator", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#-427787572", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#450#305329965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#450#305329965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"="}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<=> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter==, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#1804224252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"format"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"G"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<G> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=G, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#445#-1693996754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"withQuote", "java.lang.Character", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderCommen...#461#363998937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"true"}, false), new String[][]{{"getQuoteMode", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"<"}, false), new String[][]{{"getIgnoreHeaderCase", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"d"}, false), new String[][]{{"getEscapeCharacter", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("d", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}), new String[][]{{"getCommentMarker", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\036"}, false, 6, new String[][]{}), new String[][]{{"withHeaderComments", "java.lang.Object[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<\036> SkipHeaderRecord:false HeaderComments:[true] {getAllowMissingColumnNames=false, getCommentMarker=\036, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderCom...#469#-1812942596", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"isNullStringSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"1"}, false), new String[][]{{"withSkipHeaderRecord", "boolean", "7"}, {"print", "java.lang.Appendable", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}}), new String[][]{{"withHeader", "java.sql.ResultSet", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{","}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<,> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=,, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1945217754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}}), new String[][]{{"getRecordNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"b"}, false), new String[][]{{"withDelimiter", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"MyTQL"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<d:5.6000000000000005>"}}), new String[][]{{"getNullString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("MyTQL", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:3>"}}), new String[][]{{"getQuoteCharacter", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "_"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "S"}}), new String[][]{{"withQuote", "java.lang.Character", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\000"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"close", "", "5"}, {"getOut", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"b"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<b> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=b, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#309775974", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getQuoteMode", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<d:3.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("3.0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}), new String[][]{{"getNullString", "", "4"}, {"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#460#1384629556", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"="}, false, 6, new String[][]{}), new String[][]{{"getQuoteCharacter", "", "1"}, {"getIgnoreEmptyLines", "", "4"}, {"getIgnoreEmptyLines", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\r"}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "/"}}), new String[][]{{"withEscape", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> RecordSeparator=<\ufffe> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=nu...#456#1941750314", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}), new String[][]{{"getIgnoreEmptyLines", "", "3"}, {"isCommentMarkerSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"`"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-2>"}}), new String[][]{{"getIgnoreEmptyLines", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"."}, true), new String[][]{{"withDelimiter", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}), new String[][]{{"withEscape", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getHeaderComments=nul...#457#-139503269", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}), new String[][]{{"withCommentMarker", "java.lang.Character", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=a, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#444#705807266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:7>"}}), new String[][]{{"withQuote", "java.lang.Character", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"withCommentMarker", "java.lang.Character", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false Header:[sample, , a] {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample, , a], getH...#475#1012799958", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{" "}, false), new String[][]{{"getCommentMarker", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"22020-e1-01"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}), new String[][]{{"getSkipHeaderRecord", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "Defaut"}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}), new String[][]{{"withQuote", "java.lang.Character", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"getDelimiter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 3), new String[][]{{"isClosed", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"RecordSeparato=<"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "X"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}}), new String[][]{{"isCommentMarkerSet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#431#-1035827440", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<e> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=e, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-996602362", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"isNullStringSet", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"X"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"getRecordSeparator", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1/12345678"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"withDelimiter", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> RecordSeparator=<1/12345678> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=n...#467#1106289856", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"u"}, false, 6, new String[][]{}), new String[][]{{"getHeader", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false), new String[][]{{"getSkipHeaderRecord", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"c"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<empty>"}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<c> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=c, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#593174562", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"format", "java.lang.Object[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c\000-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1.12345678i"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}), new String[][]{{"withQuote", "java.lang.Character", "5"}, {"withIgnoreEmptyLines", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > RecordSeparator=<1.12345678i> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getH...#480#1078964704", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false), new String[][]{{"isNullStringSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"k"}, false, 1, new String[][]{}), new String[][]{{"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"-11"}, false, 6, new String[][]{}), new String[][]{{"getAllowMissingColumnNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "5"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}, 2), new String[][]{{"getIgnoreHeaderCase", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{")"}, true), new String[][]{{"withNullString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<)> NullString=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=), getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnore...#444#-263309958", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "="}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "B"}}), new String[][]{{"getCommentMarker", "", "3"}, {"withRecordSeparator", "java.lang.String", "1"}, {"withEscape", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=nul...#455#-243699635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"<"}, false), new String[][]{{"getDelimiter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "out0xFFFFFFFF"}}, 1), new String[][]{{"withAllowMissingColumnNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\ufffe> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\ufffe, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#431#1821322231", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"append", "float", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("-1.0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"3"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}}), new String[][]{{"getDelimiter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"F"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<F> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=F, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1813917210", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false), new String[][]{{"isQuoteCharacterSet", "", "4"}, {"format", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"@"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 2), new String[][]{{"withRecordSeparator", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<@> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#460#378127634", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}, {"org.apache.commons.csv.CSVPrinter", "println", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"2"}, false, 0, null, 2), new String[][]{{"parse", "java.io.Reader", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#430#1696201568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}}, 2), new String[][]{{"isClosed", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:2>"}}), new String[][]{{"insert", "int,float", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("2key1.00", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"R"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<R> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=R, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1550504038", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"r"}, false, 0, null, 2), new String[][]{{"withQuoteMode", "org.apache.commons.csv.QuoteMode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}, 1), new String[][]{{"printComment", "java.lang.String", "3"}, {"printRecord", "java.lang.Iterable", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#431#-1279642253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "MySQL"}}, 2), new String[][]{{"isQuoteCharacterSet", "", "1"}, {"getSkipHeaderRecord", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#430#1696201568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"."}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<.> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=., getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#445#-488974020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}}), new String[][]{{"withDelimiter", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1311462914", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
}
