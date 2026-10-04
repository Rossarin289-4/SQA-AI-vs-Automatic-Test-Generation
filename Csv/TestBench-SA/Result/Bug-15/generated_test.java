package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\uffff, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-312711525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"m"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:1>", "<sample:2>", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<m> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#1230231011", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"2"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}, {"withHeaderComments", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> QuoteChar=<2> SkipHeaderRecord:false HeaderComments:[key] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader...#459#-2075193743", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\000"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2), new String[][]{{"print", "java.lang.Appendable", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "4"}, {"withSkipHeaderRecord", "", "6"}, {"withTrailingDelimiter", "", "6"}, {"withEscape", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"MySQL"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\t> Escape=<\\> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\t, getEscapeCharacter=\\, ...#473#-1724721558", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", ":"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{" "}, false), new String[][]{{"withCommentMarker", "java.lang.Character", "3"}, {"withCommentMarker", "char", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"b"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<null>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"withTrim", "", "1"}, {"printer", "", "4"}, {"print", "java.lang.Object", "6"}, {"printRecord", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"e"}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:r>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:5>"}}, 2), new String[][]{{"withRecordSeparator", "char", "2"}, {"withTrailingDelimiter", "", "3"}, {"print", "java.lang.Appendable", "7"}, {"printRecord", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<null>", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\r"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}}), new String[][]{{"withCommentMarker", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> CommentStart=<0> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=0, getDelimiter=a, getEscapeCharacter=null, getHeader=n...#458#-1879574532", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "-"}}, 3), new String[][]{{"print", "java.io.File,java.nio.charset.Charset", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\n"}}, 2), new String[][]{{"println", "java.lang.Appendable", "5"}, {"withIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false Header:[sample, , a] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getH...#474#-1957665750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3), new String[][]{{"withIgnoreEmptyLines", "boolean", "7"}, {"withTrailingDelimiter", "boolean", "4"}, {"withNullString", "java.lang.String", "1"}, {"withIgnoreHeaderCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<a> EmptyLines:ignored SurroundingSpaces:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, ...#505#2128006354", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}}, 2), new String[][]{{"withIgnoreHeaderCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#458#-122790927", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"L"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "true"}}), new String[][]{{"withEscape", "java.lang.Character", "7"}, {"withCommentMarker", "java.lang.Character", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"t"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-2>"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3), new String[][]{{"withQuoteMode", "org.apache.commons.csv.QuoteMode", "1"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "5"}, {"withTrailingDelimiter", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<t> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#445#-1614308941", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"0"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<d:-250.3>"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"format", "java.lang.Object[]", "5"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "3"}, {"withHeader", "java.lang.String[]", "0"}, {"withEscape", "java.lang.Character", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> QuoteChar=<0> SkipHeaderRecord:false Header:[a] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=[...#455#-455944354", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#1216093424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeader...#444#-586498768", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 1), new String[][]{{"withAllowMissingColumnNames", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#1216093424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "0x1F"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, ge...#451#-1137744251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, ge...#451#-1137744251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=\uffff, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#440#562089266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "printer", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "printer", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:6>"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:2>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:2>", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:2>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:2>", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\000"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:2>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:2>", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", ":"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, null, 3), new String[][]{{"withDelimiter", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:4>"}}, 3), new String[][]{{"withDelimiter", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}, 3), new String[][]{{"isQuoteCharacterSet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<b> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#-1005636029", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-2>", "<sample:3>", "false"}}, 3), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}, {"printer", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#1216093424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "r"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-712921959", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#1341195481", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-1734135781", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "l"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-1926713095", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-712921959", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<empty>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<empty>", "<sample:0>"}}, 3), new String[][]{{"getQuoteCharacter", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"getOut", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2), new String[][]{{"print", "java.lang.Appendable", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:1>", "<sample:0>", "true"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:3>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2;30L45RFC4180"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getAutoFlush", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<2;30L45RFC4180> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=n...#469#-1273357205", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2;30L=45RFD4180"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getAutoFlush", ""}}, 1), new String[][]{{"isNullStringSet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\uffff"}}, 2), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "2"}, {"format", "java.lang.Object[]", "2"}, {"printer", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{";"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<;> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=;, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1808009499", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{":"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<:> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=:, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#417799099", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<6> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=6, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-848075205", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"A"}, true, 0, null, 1), new String[][]{{"isEscapeCharacterSet", "", "2"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "6"}, {"getNullString", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"2"}, true, 0, null, 3), new String[][]{{"isEscapeCharacterSet", "", "2"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "6"}, {"getNullString", "", "0"}, {"getCommentMarker", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", " "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAutoFlush", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAutoFlush", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAutoFlush", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", ":"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<1> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=1, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#440#289563086", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"f"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<f> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#-192593469", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{";"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 2), new String[][]{{"withRecordSeparator", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<;> RecordSeparator=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=...#454#-2076485083", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}, 2), new String[][]{{"withEscape", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > QuoteChar=<1> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHea...#445#-1162905838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#1216093424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false), new String[][]{{"withEscape", "java.lang.Character", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, g...#452#214101377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, ge...#451#-1137744251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{" EmptyLines:ignored"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=< EmptyLines:ignored> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=n...#474#514776971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{" mpuyLinds:iLored"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> NullString=< mpuyLinds:iLored> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=nul...#470#-2122347635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"2E-5a"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"withRecordSeparator", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> NullString=<2E-5a> RecordSeparator=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHe...#463#1324615771", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"null"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#425#-1881380786", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getHeaderComments", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#434#701565867", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{":"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<:> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#-546127037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{":"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<:> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#-546127037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false), new String[][]{{"withDelimiter", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:1>", "<sample:2>", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:1>", "<sample:2>", "false"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:8>"}}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<-> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#1106451939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"q"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<null>"}}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<q> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#2043273571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"4"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}, {"withHeaderComments", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<4> SkipHeaderRecord:false HeaderComments:[key] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader...#459#1783317939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"J"}, false, 13, new String[][]{}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "7"}, {"withHeaderComments", "java.lang.Object[]", "3"}, {"getCommentMarker", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=nu...#434#1793805968", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}}), new String[][]{{"withAllowMissingColumnNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#895585416", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#895585416", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-712921959", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false), new String[][]{{"getOut", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#450#274090561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"print", "java.lang.Appendable", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "6"}, {"parse", "java.io.Reader", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "6"}, {"parse", "java.io.Reader", "6"}, {"getFirstEndOfLine", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "6"}, {"parse", "java.io.Reader", "6"}, {"getFirstEndOfLine", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "6"}, {"parse", "java.io.Reader", "6"}, {"getFirstEndOfLine", "", "6"}, {"isClosed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "4"}, {"withSkipHeaderRecord", "", "6"}, {"withTrailingDelimiter", "", "6"}, {"parse", "java.io.Reader", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"MySQL"}, true), new String[][]{{"isCommentMarkerSet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\001"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<\001> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#752918371", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<sample:1>", "<sample:0>", "true"}}), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#437#-1535936381", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, ge...#451#-1137744251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:4>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getFirstEndOfLine=null, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}), new String[][]{{"getRecordNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getAutoFlush", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<12:30:45> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, g...#457#-1608153029", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2:30:45"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getAutoFlush", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<2:30:45> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, ge...#455#38319791", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "2"}, {"format", "java.lang.Object[]", "2"}, {"printer", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\000"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\001"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\001> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\001, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1514782373", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"M"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<M> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=M, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1061992923", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"N"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<N> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=N, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1842763973", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"7"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<7> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=7, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#542135195", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false), new String[][]{{"getTrailingDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getTrailingDelimiter", "", "4"}, {"withIgnoreHeaderCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#450#274090561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getTrailingDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"-"}, false), new String[][]{{"withHeaderComments", "java.lang.Object[]", "3"}, {"withFirstRecordAsHeader", "", "0"}, {"print", "java.lang.Object,java.lang.Appendable,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<-> SkipHeaderRecord:true HeaderComments:[key] Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=-, getHea...#462#2018057014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[2, key, 0] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, g...#460#1318025355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"q"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}), new String[][]{{"withHeaderComments", "java.lang.Object[]", "3"}, {"withFirstRecordAsHeader", "", "0"}, {"print", "java.lang.Object,java.lang.Appendable,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > Escape=<q> SkipHeaderRecord:true HeaderComments:[key] Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=q, getHea...#462#637501430", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\uffff"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=\uffff, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#440#562089266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#280560774", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"E"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<E> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=E, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1469755685", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"="}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<=> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter==, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#293463003", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAutoFlush", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "i"}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#895585416", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1.25"}}), new String[][]{{"printer", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"E"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}), new String[][]{{"printer", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"."}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}), new String[][]{{"isCommentMarkerSet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"TDF"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDe...#499#-70688400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:1>", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:1>", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:7>"}}), new String[][]{{"withIgnoreHeaderCase", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#450#274090561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"withAllowMissingColumnNames", "boolean", "3"}, {"withIgnoreSurroundingSpaces", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=...#474#674751480", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-1734135781", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#432#-1926713095", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 21, new String[][]{}), new String[][]{{"isQuoteCharacterSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#450#274090561", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "println", "java.lang.Appendable", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "println", "java.lang.Appendable", "<null>"}}), new String[][]{{"withRecordSeparator", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<\uffff> RecordSeparator=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=\uffff, getDelimiter=\000, getEscapeCharacter=null, getHeader=...#457#730524118", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[0, sample] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[0, sample], ge...#452#1829843809", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#425#-1881380786", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAutoFlush", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "m"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}}), new String[][]{{"print", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\013"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "2E-5a"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}}, 2), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"3"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "2E-5a"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}}), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "0"}}, 3), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "char", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeader...#444#-586498768", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 3), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeader...#444#-586498768", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeader...#444#-1832095054", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#1216093424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeader...#444#-1487794864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#1216093424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeader...#444#-586498768", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeader...#444#-1832095054", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2), new String[][]{{"withIgnoreEmptyLines", "boolean", "5"}, {"format", "java.lang.Object[]", "0"}, {"withIgnoreEmptyLines", "", "4"}, {"withAllowMissingColumnNames", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeader...#444#-1487794864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<s:key>", "<sample:0>", "true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "m"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "m"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "m"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "m"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getTrim", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getTrim", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getTrim", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getTrim", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}), new String[][]{{"withQuote", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false HeaderComments:[2, key, 0] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, get...#471#-1126673357", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}, 3), new String[][]{{"withQuote", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false HeaderComments:[b, 2] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeade...#461#67629253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#444#-1739498037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}), new String[][]{{"getTrim", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}, 1), new String[][]{{"getTrim", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}, 1), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true HeaderComments:[b, 2] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHead...#448#557231653", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}, {"withIgnoreHeaderCase", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=...#456#-237071681", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}, 3), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}, {"withIgnoreHeaderCase", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=...#456#-237071681", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getHeaderComments", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"withCommentMarker", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}, 2), new String[][]{{"withCommentMarker", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"withCommentMarker", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#440#-85658800", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"withCommentMarker", "char", "3"}, {"withHeader", "java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"withCommentMarker", "char", "3"}, {"format", "java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"withCommentMarker", "char", "3"}, {"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<d:1.5>", "<sample:2>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "0"}}, 1), new String[][]{{"withRecordSeparator", "java.lang.String", "7"}, {"getSkipHeaderRecord", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 1), new String[][]{{"withRecordSeparator", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<sample> SkipHeaderRecord:false Header:[0, sample] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, ...#479#667733099", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}, 1), new String[][]{{"withRecordSeparator", "java.lang.String", "7"}, {"withIgnoreSurroundingSpaces", "", "3"}, {"getDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}, 1), new String[][]{{"withRecordSeparator", "java.lang.String", "7"}, {"withIgnoreSurroundingSpaces", "", "3"}, {"getDelimiter", "", "4"}, {"withQuote", "java.lang.Character", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAutoFlush", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}), new String[][]{{"getQuoteCharacter", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAutoFlush", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false), new String[][]{{"getRecordSeparator", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getRecordSeparator", "", "5"}, {"withCommentMarker", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false Header:[a] {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=[a], getH...#450#-637657944", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}), new String[][]{{"getRecordSeparator", "", "7"}, {"withCommentMarker", "java.lang.Character", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}), new String[][]{{"getRecordSeparator", "", "7"}, {"withCommentMarker", "java.lang.Character", "5"}, {"getSkipHeaderRecord", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}, 2), new String[][]{{"getRecordSeparator", "", "7"}, {"withCommentMarker", "java.lang.Character", "5"}, {"getSkipHeaderRecord", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAutoFlush", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#895585416", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:0>", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:0>", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:true {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgn...#423#-1843001040", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 3), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgn...#423#-132268752", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 3), new String[][]{{"withSkipHeaderRecord", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:true {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgn...#423#319218576", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#945467432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-599403013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 3), new String[][]{{"withRecordSeparator", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#442#1053115970", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 3), new String[][]{{"withRecordSeparator", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeader...#442#-83954046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=true, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#425#-502815672", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printer", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}), new String[][]{{"printComment", "java.lang.String", "2"}, {"close", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1367932933", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printer", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}), new String[][]{{"printComment", "java.lang.String", "2"}, {"close", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#-1198570149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printer", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withAutoFlush", "boolean", "true"}}, 1), new String[][]{{"printComment", "java.lang.String", "4"}, {"close", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getAutoFlush=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#426#1389974523", SearchInputFactory_scaffolding.receiverState());
 }
}
