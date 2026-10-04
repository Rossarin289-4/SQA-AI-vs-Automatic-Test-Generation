package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"65535"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"-8323074"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-8323074"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "1"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:4>"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"65535"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-2147483648"}, false, 14, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-2147483644"}, false, 14, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-32729"}, false, 13, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "-8323074"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "-8323070"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:7>"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"-9"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "65533"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"1073709062"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "65564"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "2147483647"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "65564"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"30"}, false, 13, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-65535"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<empty>"}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "1073741823"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "0"}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "10"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"1073741823"}, false, 8, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"65564"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"1073741823"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "131066"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-32729"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "2147483647"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"65533"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<empty>"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "65558"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:6>"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "131116"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"65534"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"-536870880"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "65564"}, {"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-32729"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"2147483602"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<null>"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "2129919"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "536870911"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "536870911"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<null>"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:2>"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "268435455"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "268435455"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "20"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-1"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "13"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "13"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "13"}, {"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN [{\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "26"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN [{\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-8323074"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "65534"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "13"}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "65534"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "65534"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-8323074"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "1073741823"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-8323074"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "1073741823"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"13"}, false, 9, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "114"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "65534"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"-2146434560"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"268435205"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "65535"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [ x \t y ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "32767"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [ x \t y ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "32767"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "30"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "32767"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "64"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "32767"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"13"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "-32729"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"-20"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "trimTrailingSpaces", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "30"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "-2147483644"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "65534"}, {"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "30"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-8323074"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "65534"}, {"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "30"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-8323074"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "56"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-8323117"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-8323074"}, {"org.apache.commons.csv.Lexer", "isEndOfFile", "int", "-8323074"}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"11"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-2147483647"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "0"}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"-8323070"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "65533"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:8>"}, {"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isWhitespace", new String[]{"int"}, new String[]{"13"}, false, 13, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "536870911"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isCommentStart", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("TOKEN []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "0"}, {"org.apache.commons.csv.Lexer", "isCommentStart", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<empty>"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:1>"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"13"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"13"}, false, 9, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}, {"org.apache.commons.csv.Lexer", "isDelimiter", "int", "-262131"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "65534"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("COMMENT []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "-8323074"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEndOfLine", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<null>"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "13"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF [ x \t y ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "readEscape", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:6>"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EOF []", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [a,b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-4161535"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "nextToken", new String[]{"org.apache.commons.csv.Token"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "-2147483648"}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "-4161535"}, {"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.csv.Token", actual.getClass().getName());
  assertEquals("EORECORD [line1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isStartOfLine", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "isEscape", "int", "10"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "65535"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "isWhitespace", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "65533"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<null>"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:9>"}, {"org.apache.commons.csv.Lexer", "isCommentStart", "int", "64537"}, {"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEndOfFile", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "trimTrailingSpaces", "java.lang.StringBuilder", "<null>"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.csv.Lexer", "getLineNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:3>"}, {"org.apache.commons.csv.Lexer", "isEscape", "int", "262140"}, {"org.apache.commons.csv.Lexer", "readEndOfLine", "int", "13"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"48"}, false, 0, new String[][]{{"org.apache.commons.csv.Lexer", "readEscape", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isEscape", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.csv.Lexer", "isQuoteChar", "int", "1"}, {"org.apache.commons.csv.Lexer", "isStartOfLine", "int", "2147483647"}, {"org.apache.commons.csv.Lexer", "isWhitespace", "int", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isCommentStart", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isQuoteChar", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "isDelimiter", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.csv.Lexer", "org.apache.commons.csv.CSVLexer", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.csv.Lexer", "nextToken", "org.apache.commons.csv.Token", "<sample:1>"}, {"org.apache.commons.csv.Lexer", "readEscape", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
}
