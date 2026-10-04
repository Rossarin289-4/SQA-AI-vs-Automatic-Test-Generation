package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "X"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\n"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<empty>"}, {"org.apache.commons.csv.CSVPrinter", "close", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\00000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"u"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("truue\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "R"}}), new String[][]{{"withEscape", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > QuoteChar=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHeaderComments=null, ge...#450#1232974478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\r"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "RecordSearauor=<"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:6>"}, {"org.apache.commons.csv.CSVPrinter", "flush", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "Y"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withHeader", "java.sql.ResultSet", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, null, 3), new String[][]{{"format", "java.lang.Object[]", "3"}, {"withCommentMarker", "java.lang.Character", "2"}, {"withIgnoreHeaderCase", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<a> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=a, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#469#252212868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\\"}, false, 6, new String[][]{}, 2), new String[][]{{"withHeaderComments", "java.lang.Object[]", "3"}, {"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"D"}, false, 6, new String[][]{}, 3), new String[][]{{"withHeaderComments", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<D> SkipHeaderRecord:false HeaderComments:[key] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=D, getHeader=null, getHeaderComments=[...#461#-1285489076", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:2>"}}, 3), new String[][]{{"isNullStringSet", "", "0"}, {"withIgnoreEmptyLines", "", "7"}, {"isQuoteCharacterSet", "", "7"}, {"withIgnoreSurroundingSpaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false Header:[sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, get...#495#834293853", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"G"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 1), new String[][]{{"withIgnoreEmptyLines", "boolean", "0"}, {"withAllowMissingColumnNames", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<G> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#448#-152892149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<null>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}}, 3), new String[][]{{"append", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"TDF"}, true), new String[][]{{"withNullString", "java.lang.String", "2"}, {"withDelimiter", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> QuoteChar=<\"> NullString=<0> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimit...#517#1473117309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "X"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "X"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\uffff"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "out"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-963389348", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "<a>b</a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "<a>b</a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "<a>b</a>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "<a>b</a>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<sample:0>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Iterable", "<sample:0>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Iterable", "<sample:2>"}, {"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<i:-22>"}, {"org.apache.commons.csv.CSVPrinter", "getOut", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"0"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"1"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"0"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"l"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("l", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"e"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"("}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"+"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("+", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{","}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "5"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(",", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kex>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"/"}, false, 4, new String[][]{}, 2), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{";"}, false, 4, new String[][]{}, 2), new String[][]{{"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[sample, , a] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample, , a], getHeaderComments=...#462#1021072190", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1577675968", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-452409967", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1777233825", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:7>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}, 3), new String[][]{{"printRecords", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<s:_a>"}, {"org.apache.commons.csv.CSVPrinter", "flush", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "RecordSearauor=<"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:6>"}, {"org.apache.commons.csv.CSVPrinter", "flush", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\n"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", " EmptyzLines:ignored"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:8>"}, {"org.apache.commons.csv.CSVPrinter", "flush", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withHeader", "java.sql.ResultSet", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"withHeader", "java.sql.ResultSet", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "y"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[2, key, 0] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=[2,...#466#-1914823416", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "("}, {"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 3), new String[][]{{"getEscapeCharacter", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}, 3), new String[][]{{"getCurrentLineNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "print", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-963389348", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{")"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}), new String[][]{{"isCommentMarkerSet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"("}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#431#-1279642253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#450#305329965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=[1], getIgn...#450#-1030582712", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"print", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}), new String[][]{{"print", "java.lang.Appendable", "4"}, {"flush", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"getIgnoreHeaderCase", "", "4"}, {"withSkipHeaderRecord", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"getIgnoreHeaderCase", "", "4"}, {"withSkipHeaderRecord", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#-975500286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"getIgnoreHeaderCase", "", "4"}, {"withSkipHeaderRecord", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1311462914", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#430#1696201568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnore...#444#278143784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"X"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<X> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=X, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1062252634", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"A"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<A> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=A, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1795035782", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"F"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<F> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=F, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1813917210", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"G"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<G> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=G, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-817720890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"g"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=g, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#995790278", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"f"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<f> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=f, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-406042", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<I> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=I, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1174671750", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"I"}, true), new String[][]{{"getSkipHeaderRecord", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false), new String[][]{{"withEscape", "char", "3"}, {"withHeader", "java.sql.ResultSetMetaData", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "12:30:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#-2045634112", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"0"}, false), new String[][]{{"withCommentMarker", "java.lang.Character", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> CommentStart=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=nu...#456#1312850292", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#430#1245146016", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "flush", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVPrinter", "print", "java.lang.Object", "<s:a>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null,...#507#-1658916964", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false), new String[][]{{"getHeaderComments", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > NullString=<2147483648> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ...#462#-1306413678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 8, new String[][]{}), new String[][]{{"isEscapeCharacterSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getIgnoreEmptyLines", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"TDF"}, false), new String[][]{{"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-773460100", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"1"}, false, 3, new String[][]{}), new String[][]{{"getQuoteMode", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#450#305329965", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false), new String[][]{{"format", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"C"}, false), new String[][]{{"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"C"}, false), new String[][]{{"format", "java.lang.Object[]", "2"}, {"getDelimiter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"y"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000keyy\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"format", "java.lang.Object[]", "2"}, {"getHeader", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"X"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"format", "java.lang.Object[]", "2"}, {"getHeader", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"8"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}), new String[][]{{"withHeaderComments", "java.lang.Object[]", "5"}, {"getHeaderComments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, true, c]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[sample, , a] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample, , a], getHeaderComments=...#462#1021072190", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"isQuoteCharacterSet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"X"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\uffff"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<X> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#-442521408", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "R"}}), new String[][]{{"withIgnoreHeaderCase", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#467#361667752", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"j"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "R"}}), new String[][]{{"withIgnoreHeaderCase", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<j> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeader...#467#-1131087832", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"j"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "R"}}), new String[][]{{"getEscapeCharacter", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-452409967", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1777233825", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}), new String[][]{{"getAllowMissingColumnNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Iterable"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:6>"}, {"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecords", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "RecordSeparauor=<"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.sql.ResultSet", "<sample:6>"}, {"org.apache.commons.csv.CSVPrinter", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLi...#440#-2012590864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false), new String[][]{{"withHeader", "java.sql.ResultSet", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false), new String[][]{{"getCommentMarker", "", "5"}, {"getCommentMarker", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"getEscapeCharacter", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "a"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printComment", "java.lang.String", "b"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1777233825", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1577675968", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-452409967", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVPrinter", "printRecords", "java.lang.Object[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("2key02key0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1577675968", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1577675968", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1777233825", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"withCommentMarker", "java.lang.Character", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#431#-1279642253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{" "}, false), new String[][]{{"getNullString", "", "5"}, {"withNullString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > NullString=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=n...#457#1747236980", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-452409967", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}), new String[][]{{"getCommentMarker", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#456#-571162178", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"4"}, false), new String[][]{{"format", "java.lang.Object[]", "3"}, {"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"withIgnoreHeaderCase", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ...#455#938496819", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "<null>"}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printRecord", new String[]{"java.lang.Iterable"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-773460100", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "printComment", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"D"}, false, 10, new String[][]{}, 3), new String[][]{{"withHeaderComments", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<D> SkipHeaderRecord:false HeaderComments:[key] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=D, getHeader=null, getHeaderComments=[...#461#-593296820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\\"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}}, 3), new String[][]{{"getEscapeCharacter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"i"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}}, 3), new String[][]{{"getEscapeCharacter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"C"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}}, 3), new String[][]{{"getEscapeCharacter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{">"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:7>"}}, 3), new String[][]{{"getEscapeCharacter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{">"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:6>"}}, 3), new String[][]{{"getEscapeCharacter", "", "4"}, {"getHeaderComments", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#439#-773460100", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"format", "java.lang.Object[]", "2"}, {"withIgnoreSurroundingSpaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#455#2092109680", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2), new String[][]{{"format", "java.lang.Object[]", "2"}, {"withIgnoreSurroundingSpaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#457#1590422018", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "printRecord", "java.lang.Object[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"A"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getIgnoreEmptyLines", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{" "}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#-109898816", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getQuoteCharacter", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"getQuoteCharacter", "", "7"}, {"getDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getAllowMissingColumnNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[sample], getHeaderComments=null, getI...#452#-616225828", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}}, 1), new String[][]{{"getHeader", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}}), new String[][]{{"parse", "java.io.Reader", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "t"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-686420346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "println", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVPrinter", "close", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\n"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<\n> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#942834604", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\n"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<\n> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#670259116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"e"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<e> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#1533260364", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"e"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<e> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#449#1260684876", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#-1014671706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"s"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<s> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#443#854328032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"getSkipHeaderRecord", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVPrinter", "org.apache.commons.csv.CSVPrinter", "getOut", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVPrinter", "getOut", ""}}), new String[][]{{"append", "java.lang.Object", "1"}, {"append", "java.lang.String", "7"}, {"append", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1sample0", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"getIgnoreEmptyLines", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "m"}}), new String[][]{{"isNullStringSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "m"}}, 2), new String[][]{{"isNullStringSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"f"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "7"}, {"isQuoteCharacterSet", "", "1"}, {"getHeaderComments", "", "7"}, {"isCommentMarkerSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#1466784422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "\\N"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "7"}, {"isQuoteCharacterSet", "", "1"}, {"getHeaderComments", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#432#2039567526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "a\037b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
