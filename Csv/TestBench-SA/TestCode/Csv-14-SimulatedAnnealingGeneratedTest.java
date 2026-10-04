package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:7>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-1205853851", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3), new String[][]{{"withDelimiter", "char", "6"}, {"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\000"}}), new String[][]{{"withIgnoreEmptyLines", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"U"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<null>"}}, 1), new String[][]{{"format", "java.lang.Object[]", "3"}, {"getIgnoreEmptyLines", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"e"}, false, 5, new String[][]{}, 1), new String[][]{{"format", "java.lang.Object[]", "3"}, {"getIgnoreEmptyLines", "", "5"}, {"withQuote", "java.lang.Character", "1"}, {"getHeaderComments", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "7"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<null>", "<sample:1>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\n"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"TDF"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\t, getEscape...#494#23046439", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"a"}, false), new String[][]{{"getEscapeCharacter", "", "4"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "5"}, {"withQuoteMode", "org.apache.commons.csv.QuoteMode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"a"}, false), new String[][]{{"println", "java.lang.Appendable", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#438#-787347544", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}}), new String[][]{{"print", "java.io.File,java.nio.charset.Charset", "4"}, {"printRecords", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "B"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"withIgnoreHeaderCase", "", "5"}, {"withHeader", "java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"S"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}), new String[][]{{"withEscape", "java.lang.Character", "3"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "1"}, {"withHeaderComments", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> Escape=<0> CommentStart=<S> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getCommentMarker=S, getDelimiter=a, getEscapeCharacter=0, getHeader=null, getHead...#461#-2071255376", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "I"}}), new String[][]{{"withHeader", "java.lang.String[]", "6"}, {"withQuote", "java.lang.Character", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\n"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withTrim", "", "2"}, {"withEscape", "char", "3"}, {"format", "java.lang.Object[]", "5"}, {"withCommentMarker", "char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:;_>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"withQuote", "java.lang.Character", "0"}, {"withEscape", "char", "3"}, {"format", "java.lang.Object[]", "5"}, {"withCommentMarker", "char", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:ff2z>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withQuote", "java.lang.Character", "3"}, {"withQuoteMode", "org.apache.commons.csv.QuoteMode", "2"}, {"format", "java.lang.Object[]", "5"}, {"format", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0000a0sample0a000a00", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\r"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withQuote", "java.lang.Character", "3"}, {"withQuoteMode", "org.apache.commons.csv.QuoteMode", "4"}, {"format", "java.lang.Object[]", "5"}, {"withTrim", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> QuoteChar=<0> SkipHeaderRecord:false Header:[0, sample, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=[0, sample, ], getH...#461#-402089660", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 0, null, 2), new String[][]{{"withTrim", "", "3"}, {"print", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}, {"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:0>", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}, 1), new String[][]{{"withFirstRecordAsHeader", "", "5"}, {"format", "java.lang.Object[]", "0"}, {"withCommentMarker", "java.lang.Character", "5"}, {"withSkipHeaderRecord", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, get...#441#993548669", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"."}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-23>"}}, 2), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}, {"getNullString", "", "6"}, {"withHeader", "java.lang.String[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> QuoteChar=<.> SkipHeaderRecord:false Header:[sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=[sample], getHeaderComme...#452#-1214082518", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"http://Neample.com/a?b=ci"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\n"}}, 1), new String[][]{{"withNullString", "java.lang.String", "3"}, {"withAllowMissingColumnNames", "", "6"}, {"withIgnoreHeaderCase", "boolean", "3"}, {"withEscape", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> NullString=<sample> RecordSeparator=<http://Neample.com/a?b=ci> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDel...#539#856529996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\037"}, {"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 1), new String[][]{{"getHeaderComments", "", "3"}, {"getRecordSeparator", "", "4"}, {"getRecordSeparator", "", "6"}, {"withIgnoreSurroundingSpaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#446#-2133590478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "println", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#446#-2133590478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}, 2), new String[][]{{"withSkipHeaderRecord", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#444#-1741819516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}, 2), new String[][]{{"withSkipHeaderRecord", "", "6"}, {"withIgnoreHeaderCase", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#444#-1741819516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-2>", "<sample:3>", "false"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{","}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<,> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-1045689676", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"M"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "TITLE"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<M> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#147196500", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"m"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "TITLE"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1), new String[][]{{"getHeader", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"7"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2/20-02-30T25U61:61"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<7> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-2079716716", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"-"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2/20-02-30T25U61:61"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\uffff"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<-> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#1203017300", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"-"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2/20-02-30T25U61:61"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\uffff"}}, 1), new String[][]{{"withAllowMissingColumnNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> QuoteChar=<-> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEm...#431#-2024113565", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "S"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1667027039", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "S"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1667027039", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "S"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1631424671", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "`"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-248344610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "`"}}, 3), new String[][]{{"getEscapeCharacter", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"getEscapeCharacter", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"getEscapeCharacter", "", "5"}, {"withIgnoreHeaderCase", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#1301569438", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 3), new String[][]{{"getEscapeCharacter", "", "5"}, {"withIgnoreHeaderCase", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#20647324", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"getEscapeCharacter", "", "5"}, {"withIgnoreHeaderCase", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-70957186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\000"}}, 3), new String[][]{{"getEscapeCharacter", "", "5"}, {"withIgnoreHeaderCase", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-248344610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 3), new String[][]{{"getEscapeCharacter", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "0"}}, 1), new String[][]{{"withQuote", "java.lang.Character", "3"}, {"getEscapeCharacter", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 1), new String[][]{{"withQuote", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderCommen...#450#-1395490282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 1), new String[][]{{"print", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}, 3), new String[][]{{"isNullStringSet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:7>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<empty>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#419#-1125966956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#2034597684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "M"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"7"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<7> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=7, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1374799598", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"B"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<B> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=B, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#2004773966", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<Title> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ...#446#1821471624", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<null>", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "/"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "f"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "r"}, {"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:0>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "r"}, {"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:0>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<null>", "<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#438#-787347544", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<empty>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<empty>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"printRecord", "java.lang.Object[]", "3"}, {"close", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<empty>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"printRecord", "java.lang.Object[]", "3"}, {"close", "", "4"}, {"printRecord", "java.lang.Object[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#446#-2133590478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-1>", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-2123304236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"a"}, false), new String[][]{{"isCommentMarkerSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"-"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2/20-02-30T25U61:61"}}), new String[][]{{"withAllowMissingColumnNames", "", "1"}, {"withEscape", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<0> QuoteChar=<-> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=0, getHeader=null, getHeaderComments=null, get...#439#-1664994910", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"<"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "2/20-02-30T25U61:61RecordSeparator=<"}}), new String[][]{{"withAllowMissingColumnNames", "", "1"}, {"withEscape", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<0> QuoteChar=<<> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter= , getEscapeCharacter=0, getHeader=null, getHeaderComments=null, get...#439#1287717762", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1631424671", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "s"}}), new String[][]{{"getHeaderComments", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "s"}}), new String[][]{{"getHeaderComments", "", "3"}, {"withQuoteMode", "org.apache.commons.csv.QuoteMode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "s"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1667027039", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false), new String[][]{{"withTrim", "boolean", "6"}, {"withDelimiter", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<2020-01-01> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=n...#456#523002912", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#424#-1844477212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#496827876", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "a"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-248344610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:1>", "<null>"}}), new String[][]{{"getEscapeCharacter", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLi...#429#183903236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLi...#429#183903236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}}), new String[][]{{"getAllowMissingColumnNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1631424671", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}), new String[][]{{"getAllowMissingColumnNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-2123304236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"A"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:3>", "<sample:0>"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<A> CommentStart=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=nu...#446#79866811", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[a] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[a], getHeaderComments=null, getIgnoreEmpty...#431#-1572902090", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:3>", "<sample:2>"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#55274055", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:3>", "<sample:2>"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#55274055", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:3>", "<sample:2>"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}, {"getAllowMissingColumnNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}, {"withDelimiter", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#55274055", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"D"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:4>", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}}), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}, {"withDelimiter", "char", "0"}, {"getSkipHeaderRecord", "", "6"}, {"isCommentMarkerSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=[1], getIgn...#439#-1341568596", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:0>"}}), new String[][]{{"withQuote", "java.lang.Character", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false HeaderComments:[2, key, 0] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHead...#466#105496278", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}), new String[][]{{"withQuote", "java.lang.Character", "3"}, {"getEscapeCharacter", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#419#-1125966956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:7>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:7>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-1205853851", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:6>"}}), new String[][]{{"withCommentMarker", "char", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrim", ""}}), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#429#340528487", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}}), new String[][]{{"format", "java.lang.Object[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:1>", "<sample:3>", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:0>", "<null>"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:1>", "<null>"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"format", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false), new String[][]{{"withIgnoreEmptyLines", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#438#-1128534805", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false), new String[][]{{"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false), new String[][]{{"format", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "M"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "7"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"M"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<M> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#438#1682681128", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"M"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"getQuoteCharacter", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{" "}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#438#-1349688952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{" "}, false, 7, new String[][]{}), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}), new String[][]{{"withIgnoreHeaderCase", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ...#444#657811873", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "M"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}), new String[][]{{"getHeaderComments", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "f"}, {"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:0>", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "r"}, {"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:0>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#2034393563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"withHeader", "java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}), new String[][]{{"getAllowMissingColumnNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:0>"}}), new String[][]{{"withIgnoreHeaderCase", "", "7"}, {"isCommentMarkerSet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<1e10> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgn...#439#-1991773994", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "7"}}), new String[][]{{"isQuoteCharacterSet", "", "2"}, {"withDelimiter", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{}, 2), new String[][]{{"isQuoteCharacterSet", "", "2"}, {"withDelimiter", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#419#188510004", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false), new String[][]{{"getAllowMissingColumnNames", "", "0"}, {"getQuoteMode", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:0>", "<sample:4>", "true"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:0>", "<sample:4>", "true"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#424#-1844477212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getEscapeCharacter", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:0>", "<sample:1>", "false"}, {"org.apache.commons.csv.CSVFormat", "getTrim", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<empty>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\000"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<empty>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1777233825", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1777233825", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1577675968", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1577675968", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-452409967", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-452409967", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false), new String[][]{{"print", "java.lang.Object", "5"}, {"getOut", "", "5"}, {"append", "java.lang.CharSequence,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0e", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"print", "java.lang.Object", "5"}, {"getOut", "", "5"}, {"append", "java.lang.CharSequence,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0e", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"print", "java.lang.Object", "5"}, {"getOut", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Header:"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}), new String[][]{{"getNullString", "", "2"}, {"getIgnoreHeaderCase", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1.123/4567"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}, 2), new String[][]{{"getNullString", "", "2"}, {"getIgnoreHeaderCase", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1.123/4567"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}, 2), new String[][]{{"getNullString", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}), new String[][]{{"isEscapeCharacterSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"isEscapeCharacterSet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false), new String[][]{{"getTrailingDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getQuoteCharacter", "", "2"}, {"getQuoteMode", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3), new String[][]{{"getQuoteCharacter", "", "4"}, {"getQuoteMode", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3), new String[][]{{"getQuoteCharacter", "", "4"}, {"getQuoteMode", "", "2"}, {"withQuote", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#431#-438630333", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "R"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "B"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "println", new String[]{"java.lang.Appendable"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}}), new String[][]{{"withFirstRecordAsHeader", "", "6"}, {"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3), new String[][]{{"withFirstRecordAsHeader", "", "6"}, {"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3), new String[][]{{"withFirstRecordAsHeader", "", "6"}, {"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withDelimiter", "char", "6"}, {"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "a"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 3), new String[][]{{"withDelimiter", "char", "6"}, {"getQuoteMode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1228935182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"S"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<S> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=S, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#245209710", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"R"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<R> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=R, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1359294030", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"R"}, false), new String[][]{{"withQuote", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<R> QuoteChar=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=R, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#1454717300", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"r"}, false, 1, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<r> QuoteChar=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=r, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-545424012", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"a"}, false, 1, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> QuoteChar=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#1993546068", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"a"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{","}, false, 1, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<,> QuoteChar=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=,, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-196646732", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"-"}, false, 1, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<-> QuoteChar=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=-, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#411937492", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\000"}, false, 1, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"G"}, false, 12, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<G> QuoteChar=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=G, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-944741868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{".5"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "println", "java.lang.Appendable", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<.5> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnor...#435#1631729902", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"A"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<A> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=A, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#1101700777", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"B"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<B> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=B, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#910610155", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"7"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\000"}}, 3), new String[][]{{"withIgnoreEmptyLines", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<7> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=7, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderCommen...#453#934188194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<7> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=7, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#-1282360299", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "true"}}), new String[][]{{"getSkipHeaderRecord", "", "5"}, {"withEscape", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=[], getHeaderComments=null, getIgnore...#435#-525898623", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "true"}}), new String[][]{{"getSkipHeaderRecord", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "true"}}), new String[][]{{"withIgnoreEmptyLines", "", "5"}, {"withEscape", "char", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
