package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}), new String[][]{{"parse", "java.io.Reader", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "<null>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:2>"}}, 2), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withRecordSeparator", "char", "2"}, {"isCommentingEnabled", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"a"}, false), new String[][]{{"withQuoteChar", "char", "0"}, {"format", "java.lang.Object[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\r"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "/"}}), new String[][]{{"isNullHandling", "", "5"}, {"withQuotePolicy", "org.apache.commons.csv.Quote", "7"}, {"parse", "java.io.Reader", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\r"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingS...#407#-2028533691", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"."}, false, 10, new String[][]{}, 3), new String[][]{{"withCommentStart", "char", "1"}, {"withQuoteChar", "char", "4"}, {"withCommentStart", "java.lang.Character", "4"}, {"withNullString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> Escape=<.> QuoteChar=<\000> CommentStart=<\000> NullString=<sample> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter=0, getEscape=., getHeader=null, getIgnoreEmptyLines=false, getIgnore...#415#96416432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}}), new String[][]{{"getQuoteChar", "", "1"}, {"withCommentStart", "char", "4"}, {"format", "java.lang.Object[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "a"}}), new String[][]{{"format", "java.lang.Object[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"*lL)0k"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "validate", ""}}, 1), new String[][]{{"withQuoteChar", "char", "2"}, {"withHeader", "java.lang.String[]", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<a> RecordSeparator=<*lL)0k> SkipHeaderRecord:false Header:[] {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=[], getIgnoreEmptyLines=false, getIgnoreSurroundi...#409#-1783330475", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"r"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-2>"}}, 3), new String[][]{{"withQuoteChar", "char", "3"}, {"withDelimiter", "char", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#-1091547285", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"4"}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "\r"}}, 3), new String[][]{{"withNullString", "java.lang.String", "3"}, {"format", "java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withCommentStart", "char", "6"}, {"parse", "java.io.Reader", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"a"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getSkipHeaderRecord", "", "5"}, {"withCommentStart", "java.lang.Character", "6"}, {"parse", "java.io.Reader", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kC>"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:;sC>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<1> SkipHeaderRecord:false {getCommentStart=1, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-1507690092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<0> SkipHeaderRecord:false {getCommentStart=0, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#610367220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#372#-963972300", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "CommentStart=<"}}, 1), new String[][]{{"isCommentingEnabled", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kcy>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "3"}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "3"}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:5>"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"withCommentStart", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getCommentStart= , getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-1910121051", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "validate", ""}}, 2), new String[][]{{"getHeaderMap", "", "2"}, {"getRecords", "", "4"}, {"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "validate", ""}}, 2), new String[][]{{"getHeaderMap", "", "2"}, {"getRecords", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "0xFFFFFFFF"}}, 2), new String[][]{{"getHeaderMap", "", "2"}, {"getRecords", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "0xFFFFFFF"}}, 2), new String[][]{{"getHeaderMap", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"2.1123456799 0123456 SkipHHeaderRecord:"}, false, 6, new String[][]{}, 3), new String[][]{{"withNullString", "java.lang.String", "1"}, {"getCommentStart", "", "2"}, {"getHeader", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<b> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=b, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#175148846", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"a"}, true, 0, null, 3), new String[][]{{"isCommentingEnabled", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<9> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=9, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1774765340", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#363#-1567661808", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getNullString", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getNullString", "", "4"}, {"isNullHandling", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "j"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 3), new String[][]{{"withQuotePolicy", "org.apache.commons.csv.Quote", "2"}, {"getQuotePolicy", "", "6"}, {"getRecordSeparator", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuotePolicy", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}}, 2), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withRecordSeparator", "char", "2"}, {"getCommentStart", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Header:"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<Header:> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNu...#393#800350604", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"i"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<i> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#381#-1517214708", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"Q"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 1), new String[][]{{"withQuoteChar", "char", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<0> RecordSeparator=<Q> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=fals...#391#-212101839", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"4"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 1), new String[][]{{"withQuoteChar", "char", "3"}, {"getCommentStart", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"f"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withIgnoreEmptyLines", "boolean", "6"}, {"withNullString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<sample> RecordSeparator=<f> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpace...#402#162214429", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\r"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "true"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 1), new String[][]{{"withIgnoreEmptyLines", "boolean", "6"}, {"withNullString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<sample> RecordSeparator=<\r> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpace...#402#1787391229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"b"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<b> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#381#-1767400212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"6"}, false, 0, null, 1), new String[][]{{"withDelimiter", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<a> RecordSeparator=<6> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#381#-308211030", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3), new String[][]{{"parse", "java.io.Reader", "0"}, {"getHeaderMap", "", "6"}, {"getRecordNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2/a/4;"}, false, 11, new String[][]{}, 3), new String[][]{{"parse", "java.io.Reader", "0"}, {"getHeaderMap", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2/a/4;Header:"}, false, 8, new String[][]{}, 3), new String[][]{{"parse", "java.io.Reader", "0"}, {"getHeaderMap", "", "6"}, {"getHeaderMap", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true, getNul...#389#-1335807372", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}}, 1), new String[][]{{"getQuotePolicy", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}, 1), new String[][]{{"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<0> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpac...#400#-854544361", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-358350220", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1196071563", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("955199108", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-358350220", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1196071563", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k<sC>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<sC>"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getCommentStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kccy>"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-44>"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "S"}, {"org.apache.commons.csv.CSVFormat", "validate", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getCommentStart= , getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#139545844", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kccy>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"withCommentStart", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=<\000> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-802096908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "1"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "S"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "1"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "S"}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVParser", actual.getClass().getName());
  assertEquals("{getCurrentLineNumber=0, getRecordNumber=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "1"}, {"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "S"}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "0"}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "<null>"}}), new String[][]{{"isClosed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1871433099", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}}), new String[][]{{"withDelimiter", "char", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<r> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1618356203", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false), new String[][]{{"getDelimiter", "", "0"}, {"format", "java.lang.Object[]", "0"}, {"getDelimiter", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false), new String[][]{{"getDelimiter", "", "0"}, {"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}}), new String[][]{{"getDelimiter", "", "0"}, {"format", "java.lang.Object[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape= , getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-994891356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1L"}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:-2>"}}), new String[][]{{"withRecordSeparator", "char", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=< > RecordSeparator=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape= , getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#388#-1276794054", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1871433099", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1L"}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}}), new String[][]{{"isQuoting", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"a"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "java.lang.String", "1L"}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}}), new String[][]{{"isQuoting", "", "1"}, {"getQuotePolicy", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", " "}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuoteChar", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#371#-1362656138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:1>"}, false), new String[][]{{"withCommentStart", "java.lang.Character", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> CommentStart=< > SkipHeaderRecord:false {getCommentStart= , getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#380#1582405644", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "\uffff"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<Title> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNull...#389#-1609997652", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"ile"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}}), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<ile> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurround...#410#-720852380", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false), new String[][]{{"getHeaderMap", "", "7"}, {"getRecords", "", "4"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"getHeaderMap", "", "7"}, {"getRecords", "", "4"}, {"add", "java.lang.Object", "6"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "validate", ""}}), new String[][]{{"getHeaderMap", "", "2"}, {"getRecords", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"NullString=<"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<NullString=<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNu...#397#405608959", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"Ddliicter="}, false), new String[][]{{"withNullString", "java.lang.String", "1"}, {"getCommentStart", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"1.123456789 0123456"}, false, 6, new String[][]{}), new String[][]{{"withNullString", "java.lang.String", "1"}, {"getCommentStart", "", "2"}, {"getHeader", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ba2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2akeya0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "getDelimiter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getQuotePolicy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\uffff> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\uffff, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#34868008", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"s"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<s> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=s, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-2059436272", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"s"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "null"}}), new String[][]{{"isNullHandling", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:4>"}, false), new String[][]{{"getNullString", "", "4"}, {"isNullHandling", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-358350220", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1196071563", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getCommentStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("955199108", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:1>"}}), new String[][]{{"getHeader", "", "3"}, {"withEscape", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<\000> QuoteChar=<b> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=\000, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullSt...#381#1823450249", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isNullHandling", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:6>"}, false), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withRecordSeparator", "char", "2"}, {"getCommentStart", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withRecordSeparator", "char", "2"}, {"getCommentStart", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withRecordSeparator", "char", "2"}, {"getCommentStart", "", "5"}, {"withCommentStart", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<a> CommentStart=<a> RecordSeparator=<a> SkipHeaderRecord:false {getCommentStart=a, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurround...#404#499273012", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuotePolicy", new String[]{"org.apache.commons.csv.Quote"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}), new String[][]{{"withQuoteChar", "java.lang.Character", "2"}, {"withRecordSeparator", "char", "2"}, {"getCommentStart", "", "5"}, {"withCommentStart", "java.lang.Character", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> CommentStart=<a> RecordSeparator=<a> SkipHeaderRecord:false {getCommentStart=a, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurround...#407#-1095732505", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"\r"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"char"}, new String[]{"\000"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}}), new String[][]{{"withCommentStart", "java.lang.Character", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> QuoteChar=<\000> CommentStart=<a> SkipHeaderRecord:false {getCommentStart=a, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, get...#387#941039563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"OullStrig=<"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\014"}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", ","}}), new String[][]{{"withSkipHeaderRecord", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<OullStrig=<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, g...#401#-2048160916", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withCommentStart", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > CommentStart=<\000> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-1928056652", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withCommentStart", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<+> CommentStart=<\000> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter=+, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-167621666", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"*"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}), new String[][]{{"withCommentStart", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<*> CommentStart=<\000> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter=*, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#2015048224", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{")"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}}), new String[][]{{"withCommentStart", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<)> CommentStart=<\000> SkipHeaderRecord:false {getCommentStart=\000, getDelimiter=), getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#377#-97249182", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withDelimiter", new String[]{"char"}, new String[]{"9"}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<9> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=9, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1774765340", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"4'!in.o"}, false), new String[][]{{"isCommentingEnabled", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getHeader", ""}, {"org.apache.commons.csv.CSVFormat", "toString", ""}, {"org.apache.commons.csv.CSVFormat", "format", "java.lang.Object[]", "<null>"}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"\r"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"s"}, false), new String[][]{{"getQuotePolicy", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"S"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<S> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#381#-1019697012", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"6"}, false), new String[][]{{"withSkipHeaderRecord", "boolean", "7"}, {"getHeader", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"r"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}), new String[][]{{"withSkipHeaderRecord", "boolean", "7"}, {"getHeader", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"p"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withSkipHeaderRecord", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > RecordSeparator=<p> SkipHeaderRecord:true {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStrin...#379#1307727930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"\r"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "N"}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "g"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withQuoteChar", "char", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<a> RecordSeparator=<\r> SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=fals...#391#-252892647", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"<"}, false, 3, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"withIgnoreEmptyLines", "boolean", "6"}, {"withNullString", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<sample> RecordSeparator=<<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpace...#402#-1580267299", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<empty>"}, false), new String[][]{{"isClosed", "", "5"}, {"getHeaderMap", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "java.lang.Character", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getHeader", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "b"}}), new String[][]{{"parse", "java.io.Reader", "0"}, {"getHeaderMap", "", "6"}, {"getRecordNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}}), new String[][]{{"isCommentingEnabled", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{}), new String[][]{{"isCommentingEnabled", "", "4"}, {"format", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"isCommentingEnabled", "", "4"}, {"format", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "getQuoteChar", ""}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}), new String[][]{{"withNullString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> NullString=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=0,...#375#224364467", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreSurroundingSpaces", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}, {"org.apache.commons.csv.CSVFormat", "withRecordSeparator", "char", "\r"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SurroundingSpaces:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=true, getNul...#389#-1335807372", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("955199108", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{"0xFoFFFFFFF"}, false), new String[][]{{"getDelimiter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withNullString", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"getSkipHeaderRecord", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"getIgnoreSurroundingSpaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1), new String[][]{{"withQuoteChar", "char", "0"}, {"format", "java.lang.Object[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1), new String[][]{{"withQuoteChar", "char", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<\000> RecordSeparator=<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false...#389#1603119373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"withQuoteChar", "java.lang.Character", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<\000> RecordSeparator=<> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false...#389#1603119373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getRecordSeparator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "\r"}, {"org.apache.commons.csv.CSVFormat", "withCommentStart", "char", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"!"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<!> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=!, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1139796716", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"n"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<n> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=n, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1654850490", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"N"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<N> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=N, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1793491974", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"M"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<M> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=M, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#156422212", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"F"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<F> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=F, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#1581835766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"-"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<-> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=-, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-690202620", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"4"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:0>"}}, 1), new String[][]{{"withIgnoreSurroundingSpaces", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<4> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1604595691", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{"="}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}}, 1), new String[][]{{"getSkipHeaderRecord", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "withNullString", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-358350220", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1309518420", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "getRecordSeparator", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1196071563", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("955199108", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{" "}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#-2112967253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreEmptyLines", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"java.lang.Character"}, new String[]{"<null>"}, false), new String[][]{{"withDelimiter", "char", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withDelimiter", "char", "\r"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "newFormat", new String[]{"char"}, new String[]{"\000"}, true), new String[][]{{"getQuoteChar", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> EmptyLines:ignored SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=true, getIgnoreSurroundingSpaces=false, getNullString...#382#-1193845305", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isEscaping", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "a"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "\uffff"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"format", "java.lang.Object[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withCommentStart", new String[]{"char"}, new String[]{"b"}, false, 0, null, 2), new String[][]{{"getQuotePolicy", "", "7"}, {"getEscape", "", "3"}, {"getHeader", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"format", "java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true\000c", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2), new String[][]{{"format", "java.lang.Object[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}}), new String[][]{{"format", "java.lang.Object[]", "6"}, {"getSkipHeaderRecord", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}), new String[][]{{"format", "java.lang.Object[]", "6"}, {"getSkipHeaderRecord", "", "4"}, {"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1871433099", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 2), new String[][]{{"format", "java.lang.Object[]", "6"}, {"getSkipHeaderRecord", "", "5"}, {"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false Header:[0, sample] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[0, sample], getIgnoreEmptyLines=false, getIgnoreSurroundingSpace...#400#-1532909705", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 3), new String[][]{{"format", "java.lang.Object[]", "6"}, {"isNullHandling", "", "5"}, {"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=<a> SkipHeaderRecord:false Header:[a, 0] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[a, 0], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, g...#390#-929652449", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withCommentStart", "java.lang.Character", "b"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 3), new String[][]{{"format", "java.lang.Object[]", "6"}, {"isNullHandling", "", "5"}, {"withQuoteChar", "char", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > QuoteChar=<a> SkipHeaderRecord:false Header:[a, 0] {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=[a, 0], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, g...#390#-1511081633", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withRecordSeparator", new String[]{"char"}, new String[]{"5"}, false, 5, new String[][]{{"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}, 2), new String[][]{{"format", "java.lang.Object[]", "3"}, {"getQuoteChar", "", "0"}, {"withQuotePolicy", "org.apache.commons.csv.Quote", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> RecordSeparator=<5> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullStri...#388#-210455928", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> SkipHeaderRecord:false Header:[0, sample] {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=[0, sample], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNu...#390#-1543529130", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "b"}, {"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b\0002", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}, {"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "b"}, {"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "2"}, {"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "2"}, {"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2\000key\0000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "format", new String[]{"java.lang.Object[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "char", "2"}, {"org.apache.commons.csv.CSVFormat", "isCommentingEnabled", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}, {"org.apache.commons.csv.CSVFormat", "parse", "java.io.Reader", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getDelimiter", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}, {"org.apache.commons.csv.CSVFormat", "withHeader", "java.lang.String[]", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false), new String[][]{{"isClosed", "", "5"}, {"close", "", "2"}, {"getCurrentLineNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false), new String[][]{{"isClosed", "", "5"}, {"close", "", "2"}, {"getCurrentLineNumber", "", "5"}, {"getRecords", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.8410000000000001>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "hashCode", ""}, {"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:3>"}, {"org.apache.commons.csv.CSVFormat", "isNullHandling", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isCommentingEnabled", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"\016"}, false, 0, new String[][]{{"org.apache.commons.csv.CSVFormat", "validate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> Escape=<\016> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=\016, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, get...#371#-942882204", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{"5"}, false), new String[][]{{"withQuotePolicy", "org.apache.commons.csv.Quote", "1"}, {"getDelimiter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withEscape", new String[]{"char"}, new String[]{" "}, false), new String[][]{{"withQuotePolicy", "org.apache.commons.csv.Quote", "1"}, {"getDelimiter", "", "0"}, {"isEscaping", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.CSVFormat", "withEscape", "char", "_"}, {"org.apache.commons.csv.CSVFormat", "getIgnoreSurroundingSpaces", ""}}), new String[][]{{"getQuotePolicy", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "getNullString", ""}, {"org.apache.commons.csv.CSVFormat", "withEscape", "char", "_"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=< > SkipHeaderRecord:false Header:[a] {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=[a], getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, g...#374#-259225482", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withHeader", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.csv.CSVFormat", "isEscaping", ""}}, 2), new String[][]{{"withSkipHeaderRecord", "boolean", "7"}, {"getHeader", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "\001"}, {"org.apache.commons.csv.CSVFormat", "withIgnoreEmptyLines", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "validate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuoteChar", "java.lang.Character", "."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getRecords", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [a], [b]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"getRecords", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [{\"a\":1}]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"getRecords", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, [a]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "withQuoteChar", new String[]{"java.lang.Character"}, new String[]{" "}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.CSVFormat", actual.getClass().getName());
  assertEquals("Delimiter=<\000> QuoteChar=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=nul...#374#1008782699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "parse", new String[]{"java.io.Reader"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.csv.CSVFormat", "withQuotePolicy", "org.apache.commons.csv.Quote", "<sample:5>"}}, 3), new String[][]{{"getRecords", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getNullString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "isQuoting", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "isQuoting", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.CSVFormat", "getSkipHeaderRecord", ""}, {"org.apache.commons.csv.CSVFormat", "isEscaping", ""}, {"org.apache.commons.csv.CSVFormat", "isQuoting", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Delimiter=<\000> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=\000, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1343897878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=< > SkipHeaderRecord:false {getCommentStart=null, getDelimiter= , getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-497273046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<a> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=a, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-1461920916", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.CSVFormat", "org.apache.commons.csv.CSVFormat", "getEscape", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "withSkipHeaderRecord", "boolean", "false"}, {"org.apache.commons.csv.CSVFormat", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Delimiter=<0> SkipHeaderRecord:false {getCommentStart=null, getDelimiter=0, getEscape=null, getHeader=null, getIgnoreEmptyLines=false, getIgnoreSurroundingSpaces=false, getNullString=null, getQuoteCha...#364#-73960630", SearchInputFactory_scaffolding.receiverState());
 }
}
