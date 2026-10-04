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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:1>", "<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\n"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\n"}}), new String[][]{{"isNullStringSet", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}}), new String[][]{{"withHeaderComments", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[, true, c] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=[, ...#455#-1784453076", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", ":"}}, 3), new String[][]{{"withEscape", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"UneypeQted Quote value: "}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<null>"}}), new String[][]{{"withTrailingDelimiter", "", "1"}, {"println", "java.lang.Appendable", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<UneypeQted Quote value: > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHe...#483#573932461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\r"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"8"}, false, 2, new String[][]{}), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "4"}, {"print", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:1>"}}), new String[][]{{"parse", "java.io.Reader", "3"}, {"getCurrentLineNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"\000"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"p"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 3), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "3"}, {"format", "java.lang.Object[]", "5"}, {"withEscape", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> QuoteChar=<p> SkipHeaderRecord:false Header:[sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=[sample], getHea...#460#477715205", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:2>"}}, 1), new String[][]{{"getCommentMarker", "", "0"}, {"withIgnoreHeaderCase", "", "7"}, {"format", "java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 3), new String[][]{{"withIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#464#1683961003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}), new String[][]{{"withEscape", "java.lang.Character", "6"}, {"withTrailingDelimiter", "", "4"}, {"withCommentMarker", "java.lang.Character", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, null, 3), new String[][]{{"withQuoteMode", "org.apache.commons.csv.QuoteMode", "0"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#431#1626636702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"u"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:4>"}}), new String[][]{{"format", "java.lang.Object[]", "5"}, {"withTrailingDelimiter", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<u> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=u, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#429#76993799", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:11>"}}, 3), new String[][]{{"withIgnoreSurroundingSpaces", "", "7"}, {"isQuoteCharacterSet", "", "7"}, {"withQuote", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-536870912>", "<sample:4>", "true"}, {"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}}, 3), new String[][]{{"printRecord", "java.lang.Appendable,java.lang.Object[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<;> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-1674823404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"A"}, false), new String[][]{{"withEscape", "java.lang.Character", "7"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "1"}, {"getCommentMarker", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 1), new String[][]{{"withCommentMarker", "char", "3"}, {"withNullString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> NullString=<> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=n...#469#674855275", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", " "}}), new String[][]{{"withHeader", "java.sql.ResultSet", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\n"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}), new String[][]{{"withCommentMarker", "java.lang.Character", "6"}, {"withQuote", "java.lang.Character", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"A"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\n"}, {"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "5"}, {"getQuoteCharacter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"MySQL"}, true), new String[][]{{"getNullString", "", "1"}, {"withHeader", "java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"e"}, true), new String[][]{{"withEscape", "char", "7"}, {"print", "java.lang.Object,java.lang.Appendable,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<e> Escape=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=e, getEscapeCharacter=0, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#429#1622180957", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 3), new String[][]{{"withRecordSeparator", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<0> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#444#135197108", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"i"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<i> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-1313517612", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLi...#429#183903236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:1>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"withTrim", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}, 2), new String[][]{{"printRecord", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b/>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}, 1), new String[][]{{"withQuote", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEm...#431#-1456460993", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-2147483605>", "<sample:0>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<s:yb>", "<sample:2>", "true"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"Esc`pe=<"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}, 1), new String[][]{{"withTrailingDelimiter", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<Esc`pe=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ge...#446#622787225", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}, 3), new String[][]{{"withEscape", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<a> RecordSeparator=<I> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=a, getHeader=null, getHeaderComments=nu...#446#409906655", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"e"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 3), new String[][]{{"withHeader", "java.sql.ResultSet", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<{\"a\":1}> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#450#-2003111096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"0"}, false, 0, null, 1), new String[][]{{"withSkipHeaderRecord", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=0, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEm...#433#1536142321", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "r"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"H0/0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}}, 3), new String[][]{{"getTrailingDelimiter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}}, 1), new String[][]{{"withQuote", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, get...#438#929728686", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "A"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteCharacter", ""}}, 2), new String[][]{{"withDelimiter", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=a, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1827898414", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-248344610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"withTrim", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Unnexpectfd Quote value: "}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "L"}}, 1), new String[][]{{"withTrailingDelimiter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<Unnexpectfd Quote value: > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getH...#485#-1796800465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"g"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<s:b>", "<null>", "false"}, {"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=g, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-561640210", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"getIgnoreHeaderCase", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:41>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:2>"}}, 1), new String[][]{{"isEscapeCharacterSet", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"7"}, false, 1, new String[][]{}, 1), new String[][]{{"getCommentMarker", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"IEscape=<"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<IEscape=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=nu...#454#-1567084120", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:3>", "<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "\n"}}, 1), new String[][]{{"close", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{" "}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 1), new String[][]{{"withQuote", "char", "5"}, {"withFirstRecordAsHeader", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, get...#438#-1570329108", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{":"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<:> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=:, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1967453362", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"y"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withFirstRecordAsHeader", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<y> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=y, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-2038142612", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "="}}, 1), new String[][]{{"getTrailingDelimiter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}}, 1), new String[][]{{"getNullString", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 1), new String[][]{{"getIgnoreHeaderCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#419#-1125966956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{" "}, false, 7, new String[][]{}, 3), new String[][]{{"withIgnoreHeaderCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=< > IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#462#1265849760", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}, 1), new String[][]{{"withHeader", "java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-248344610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:3>"}}, 3), new String[][]{{"withSkipHeaderRecord", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<sample:2>"}}, 1), new String[][]{{"withNullString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#431#2019258172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "1"}, {"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}}, 1), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#2034393563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\uffff"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#438#-204701848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-2147483648>", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#428#886053310", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "`"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Appendable"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeaderComments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", " SkipHeaderRecodrdd:"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{"Escape=<"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"e"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<e> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=e, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#-1482594319", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "println", "java.lang.Appendable", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"e"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<e> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=e, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#1666528430", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<5> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=5, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-691999058", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"withTrailingDelimiter", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeaderComments", "java.lang.Object[]", "<sample:1>"}}), new String[][]{{"withDelimiter", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#424#-1844477212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "Excel1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1631424671", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"x"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<x> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=x, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#-818348841", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1631424671", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentMarker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{" SkipHeaderRecodr\nd:"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", ":"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=< SkipHeaderRecodr\nd:> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComme...#471#1373573934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeaderComments", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLi...#429#183903236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "8"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#427#-248344610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Reco"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<Reco> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, g...#444#-1647634150", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullStringSet", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<s:3>", "<sample:1>", "false"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscapeCharacter", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", " "}, {"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<empty>", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<i> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=i, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#429#-441620601", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false HeaderComments:[0, ] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=[0, ], ge...#443#154992012", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"\000"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:3>", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}), new String[][]{{"withHeader", "java.lang.String[]", "4"}, {"parse", "java.io.Reader", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"0"}, false, 7, new String[][]{}), new String[][]{{"withHeader", "java.sql.ResultSetMetaData", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteCharacter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "printRecord", "java.lang.Appendable,java.lang.Object[]", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "printRecord", new String[]{"java.lang.Appendable", "java.lang.Object[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:yb>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSetMetaData", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "println", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "println", "java.lang.Appendable", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"withEscape", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#428#1857605456", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#-565944375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"getRecords", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[CSVRecord [comment=null, mapping=null, recordNumber=1, values=[a]], CSVRecord [comment=null, mapping=null, recordNumber=2, values=[b]]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}}), new String[][]{{"withFirstRecordAsHeader", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null, getIgnoreEmptyLin...#426#1145872889", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"2"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<2> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-438349708", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#420#2034393563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentMarker", ""}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "0"}, {"withRecordSeparator", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<0> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, ge...#462#2045103825", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "h"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}), new String[][]{{"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<0> SkipHeaderRecord:false HeaderComments:[key] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderCom...#455#568645134", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withRecordSeparator", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<a> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#438#-787347544", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"l"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<l> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#1137636020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"trve"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}), new String[][]{{"getAllowMissingColumnNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<null>", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#419#-1125966956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}), new String[][]{{"withIgnoreHeaderCase", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullStringSet", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", ""}}), new String[][]{{"getRecordNumber", "", "2"}, {"getHeaderMap", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"4"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<4> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=4, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#-709088433", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#446#-2133590478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withFirstRecordAsHeader", "", "2"}, {"withIgnoreEmptyLines", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=null...#445#-1586513133", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:1>", "<sample:0>"}}), new String[][]{{"getAllowMissingColumnNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withFirstRecordAsHeader", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:8>", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "c"}}), new String[][]{{"withRecordSeparator", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=< > SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments=nul...#444#-502762092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}), new String[][]{{"parse", "java.io.Reader", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "6"}}), new String[][]{{"withIgnoreHeaderCase", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Unexpected Quote value: Title"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<empty>", "<sample:0>"}}), new String[][]{{"getDelimiter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}), new String[][]{{"getRecordSeparator", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false), new String[][]{{"getIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\n"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "v"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"PPT1H"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<null>"}}), new String[][]{{"withFirstRecordAsHeader", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<PPT1H> SkipHeaderRecord:true Header:[] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[], getHeaderComments...#452#-1221614422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}}), new String[][]{{"getQuoteCharacter", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "RFC4180"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#419#-1125966956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Defult0x123456789"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "b"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}), new String[][]{{"withHeader", "java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"u"}, true), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"withEscape", "char", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}), new String[][]{{"withQuote", "java.lang.Character", "1"}, {"getTrailingDelimiter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\n"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<i:-1>", "<sample:0>", "false"}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"S"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreHeaderCase", ""}}), new String[][]{{"getEscapeCharacter", "", "6"}, {"withNullString", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<0> RecordSeparator=<S> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComm...#450#-1840197946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<null>"}}), new String[][]{{"withRecordSeparator", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgn...#434#410961712", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "9"}}), new String[][]{{"getAllowMissingColumnNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.io.File", "java.nio.charset.Charset"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:2>"}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#444#-1741819516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{}), new String[][]{{"withDelimiter", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#446#-2133590478", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"format", "java.lang.Object[]", "5"}, {"print", "java.io.File,java.nio.charset.Charset", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"4"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<4> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=4, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#422085262", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"0"}, false, 1, new String[][]{}), new String[][]{{"getIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:4>", "<sample:2>"}}), new String[][]{{"getDelimiter", "", "0"}, {"withDelimiter", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter= , getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-2009922137", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false), new String[][]{{"withHeader", "java.sql.ResultSet", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"withNullString", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#431#2019258172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"DF"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"print", "java.lang.Object,java.lang.Appendable,boolean", "4"}, {"printRecord", "java.lang.Appendable,java.lang.Object[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<DF> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, get...#440#694307348", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}}), new String[][]{{"getDelimiter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Object,java.lang.Appendable,boolean", "<s:1>", "<null>", "true"}}), new String[][]{{"getDelimiter", "", "5"}, {"withIgnoreHeaderCase", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:3>"}}), new String[][]{{"isClosed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.lang.Object", "java.lang.Appendable", "boolean"}, new String[]{"<d:41.5>", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#439#-621707801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"java.lang.Character"}, new String[]{"A"}, false), new String[][]{{"getDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"."}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}}), new String[][]{{"withIgnoreHeaderCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<.> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=., getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#1927004570", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}}), new String[][]{{"getTrailingDelimiter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[0, sample] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=[0, sample], getHeaderComments=null...#447#-370586666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteMode", new String[]{"org.apache.commons.csv.QuoteMode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}), new String[][]{{"withNullString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<sample> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getI...#446#-1826117942", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{" "}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}}), new String[][]{{"getDelimiter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"http:://example.com/a?b=c5."}, false, 5, new String[][]{}), new String[][]{{"withQuote", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> NullString=<http:://example.com/a?b=c5.> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader...#496#399102358", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "1-"}, {"org.apache.commons.csv.CSVFormat", "getEscapeCharacter", ""}}), new String[][]{{"withQuote", "java.lang.Character", "7"}, {"withHeader", "java.sql.ResultSetMetaData", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"withIgnoreHeaderCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, ...#444#657811873", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}), new String[][]{{"getHeaderComments", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "S"}}), new String[][]{{"getDelimiter", "", "5"}, {"withNullString", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnore...#433#841950252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<empty>"}}), new String[][]{{"getEscapeCharacter", "", "0"}, {"getSkipHeaderRecord", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}}), new String[][]{{"getIgnoreEmptyLines", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{}), new String[][]{{"withIgnoreSurroundingSpaces", "", "1"}, {"withAllowMissingColumnNames", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#444#-1741819516", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "\u00e8"}}), new String[][]{{"getQuoteMode", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:7>"}, false), new String[][]{{"print", "java.nio.file.Path,java.nio.charset.Charset", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"8"}, false), new String[][]{{"print", "java.io.File,java.nio.charset.Charset", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "TDF"}}), new String[][]{{"withRecordSeparator", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=< > SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIg...#437#2097748631", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2147483648\r"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", "boolean", "true"}}), new String[][]{{"withQuote", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > RecordSeparator=<2147483648\r> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getH...#469#1251742692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{"o"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"getDelimiter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getEscapeCharacter", "", "5"}, {"getIgnoreHeaderCase", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "l"}, {"org.apache.commons.csv.CSVFormat", "getQuoteMode", ""}}), new String[][]{{"withQuote", "java.lang.Character", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getAllowMissingColumnNames", "", "2"}, {"getHeaderComments", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:3>"}}), new String[][]{{"withIgnoreHeaderCase", "", "6"}, {"withRecordSeparator", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<> IgnoreHeaderCase:ignored SkipHeaderRecord:false HeaderComments:[1] {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, g...#478#328332194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"8"}, false), new String[][]{{"getDelimiter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "1.12345670x1FDefault"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", "x"}}), new String[][]{{"withEscape", "char", "5"}, {"withNullString", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > NullString=<0> SkipHeaderRecord:true {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter= , getHeader=null, getHeaderComments=null, ge...#439#-934709169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}), new String[][]{{"isNullStringSet", "", "1"}, {"withNullString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#431#2019258172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:2>"}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#445#-161867483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"withRecordSeparator", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<0> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, get...#462#214828960", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getTrailingDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrim", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}), new String[][]{{"withFirstRecordAsHeader", "", "1"}, {"getAllowMissingColumnNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeaderComments", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"getHeader", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1941554113", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "f"}}), new String[][]{{"getQuoteCharacter", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"p"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<p> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=p, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#429#-1928665241", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"getRecordNumber", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"`"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<`> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#432#-77043916", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteMode", "org.apache.commons.csv.QuoteMode", "<sample:2>"}}, 1), new String[][]{{"withQuote", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeader...#456#1612459500", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoteCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.Class", "<sample:0>"}}), new String[][]{{"withDelimiter", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "valueOf", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "print", new String[]{"java.nio.file.Path", "java.nio.charset.Charset"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.sql.ResultSet", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getTrim", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.lang.Appendable", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "isEscapeCharacterSet", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"char"}, new String[]{"\r"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "isCommentMarkerSet", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}), new String[][]{{"print", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}, 3), new String[][]{{"withHeader", "java.sql.ResultSet", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "println", "java.lang.Appendable", "<sample:1>"}}), new String[][]{{"getTrailingDelimiter", "", "0"}, {"getIgnoreEmptyLines", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<\uffff> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=\uffff, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#429#-932569017", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"S020-02-30T25:61:61I"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<d:1.96>"}}), new String[][]{{"getIgnoreEmptyLines", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withTrailingDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<sample:2>", "<null>"}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null...#445#-161867483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSet"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}), new String[][]{{"getIgnoreEmptyLines", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", "boolean", "false"}}, 2), new String[][]{{"withEscape", "java.lang.Character", "7"}, {"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.sql.ResultSetMetaData"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "R"}, {"org.apache.commons.csv.CSVFormat", "getTrim", ""}}), new String[][]{{"parse", "java.io.Reader", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=1, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"n"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withTrim", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<n> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=n, getHeader=null, getHeaderComments=null, getIgnoreEmptyLi...#428#1310822818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> IgnoreHeaderCase:ignored SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null,...#445#-12278794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"6"}, true), new String[][]{{"isNullStringSet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "char", "."}}), new String[][]{{"getIgnoreEmptyLines", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"o"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", ""}, {"org.apache.commons.csv.CSVFormat", "print", "java.nio.file.Path,java.nio.charset.Charset", "<sample:7>", "<sample:3>"}}), new String[][]{{"withIgnoreSurroundingSpaces", "", "6"}, {"getIgnoreHeaderCase", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentMarker", new String[]{"java.lang.Character"}, new String[]{" "}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker= , getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreE...#435#-1182243289", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"g"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<g> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=g, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-561640210", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"z\t"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", "boolean", "false"}}), new String[][]{{"withHeader", "java.sql.ResultSet", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"l"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1.12345678901234560110"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<l> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=l, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1837094514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"UneypeQted Quote value: Escape=<null"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "print", "java.io.File,java.nio.charset.Charset", "<null>", "<sample:2>"}}), new String[][]{{"withHeader", "java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withAllowMissingColumnNames", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=true, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=false...#420#-1631424671", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getAllowMissingColumnNames", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=0, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#583455246", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuote", new String[]{"char"}, new String[]{"<"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withTrim", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getTrim", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentMarker", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreHeaderCase", ""}}), new String[][]{{"isCommentMarkerSet", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getAllowMissingColumnNames=false, getCommentMarker=null, getDelimiter=\000, getEscapeCharacter=null, getHeader=null, getHeaderComments=null, getIgnoreEmptyLines=fals...#421#-1775072242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuote", "java.lang.Character", "*"}, {"org.apache.commons.csv.CSVFormat", "withCommentMarker", "java.lang.Character", ":"}}), new String[][]{{"getTrailingDelimiter", "", "2"}, {"withTrim", "", "3"}, {"print", "java.nio.file.Path,java.nio.charset.Charset", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
}
