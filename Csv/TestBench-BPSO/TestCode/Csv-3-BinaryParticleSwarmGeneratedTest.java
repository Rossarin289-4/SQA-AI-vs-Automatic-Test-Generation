package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "65535"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-2031618"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"-13"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"65535"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"33"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"8454143"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "2147483647"}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-589823"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"16385"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "61"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"-2075"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"131068"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"3"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"16809984"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"1073741823"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "65535"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN [{\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"33619968"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"1073741823"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-2080374783"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"1073741823"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "2147483647"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "1073741821"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"-2080374835"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [line1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"1073872895"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"-2080374735"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "2147483647"}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "13"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "131070"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [line1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"65570"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<empty>"}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "65534"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "65534"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [ x \t y ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:8>"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"-16777225"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "1"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "32767"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "33"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "17"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:11>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [line1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-16809984"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "65535"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"8174"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<empty>"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-16807935"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [ine1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN [{\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "-8404992"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN [{\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "131066"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "16777098"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "16810016"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-43"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "4259837"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "16807936"}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "-16809959"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "131070"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "16809984"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "1073741814"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "8"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "-2080374818"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "2113929215"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "8404992"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "16809952"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "1073741874"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "-1040187375"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "-2147483617"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"97"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"32"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "-21004288"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"30"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
