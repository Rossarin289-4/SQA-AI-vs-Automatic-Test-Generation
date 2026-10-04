package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "2", "\t"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=-2, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "abcc", "abc", "<sample:13>", "10", "30", ">."}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1073741823", "\n", "0", "<sample:11>", "u"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<null>", "3", "-2147483648", "1.B1144567890H23456"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"131101", "lime.separator", "1.5", "<sample:1>", "I"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", ".  a b", " | ", "<sample:4>", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"16", "\u00e9", "", "<sample:9>", "<a>b</aP> <{\"a\":1}"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"].5"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "aa{c", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=].5, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"1Title"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-2147483648, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=1Title, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{">>-1", "true", "<sample:2>", "a", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1/123456781e10"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "16777313"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1/123456781e10, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=16777313}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:4>", "-2147483648", "2147483647", "\t\t"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483647", "a", "0\n10 ", "<sample:4>", "usage: ", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "33"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=33, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"", "<sample:1>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.5d"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1048560", "a", "2020-02-30T25:61:61", "<sample:6>", "2.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "[[", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"59"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:5>", "75", "115f", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                           ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"ine.separator123456789012345678901234567890", "73", "-2147483648"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "-130999", "-0.", "nullTitle", "<sample:5>", "-2147450880", "16", "1.55"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "-1073741824", "0xFFFFFFFF"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "75", "<sample:2>", "47", "-30"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:3>", "-1048576", "1e101e10", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=\t, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"  ", "1.-5d", "<sample:4>", "H0"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<null>", "66", "X][", "1020-02-30T25:61:61", "<sample:0>", "-46", "-130999", "1-B1244567890123456"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.52147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"48"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:2>", "-4", "<sample:10>", "2147483647", "29"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=48}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:7>", "-1040187391", "115f"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"55."}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("55.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1084", "21474836480x123456789", "1.5;", "<sample:4>", "-F"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "52", "-16253002", "A1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("A1 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"115/f"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("115/f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=123456789012345678901234567890, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483583", "I", "1.B1244567890123456", "<sample:7>", "2147883648", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"1.6", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1.>, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"12:30:45null"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=12:30:45null, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "2147483647", "59", "115f"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "Hello, <orld", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("115f {length=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<null>", "524292", "-13", "1.5e200"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "10", "abc", "2e10123456789012345678901234567890", "<sample:13>", "<"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"Hello+ World | "}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=Hello+ World | , getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"0x123456789\t", "<sample:10>", "false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "0xFFEFFFFFF", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=Title, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "20"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=20, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"35", "-,1", "Hello+ World | ", "<sample:2>", "[n1{2]"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "65611"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=65611, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:5>", "26", "<sample:1>", "79", "59"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "-2147483648", "1.1234567"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-37"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"2020-02-30T25:61:61", "-75", "59"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "-59", "3", "1L <"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:4>", "130999", "<sample:1>", "262156", "-75"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"122909"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:4>", "2147483647", " ", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=122909, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "2147483647", "59", "0x12345679"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"usage: ", "", "<sample:0>", "214748364", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"2147483638"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=2147483638, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-1073741781", "1E-5", "1.5", "<sample:15>", "1.-d]", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:0>", "2147483647", "-1.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "2", "<sample:6>", "-1073741803", "71"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "<a>b</aPn> ={\"a\":1}", "nulla_b3", "<sample:0>", "00x1F", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-1073741824", "1.-d", "P/1H", "<sample:4>", "a", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{".5PT1H"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "["}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=.5PT1H, getOptPrefix=-, getSyntaxPrefix=[, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=a, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "-2147483648", "1.52"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "-", "32", "-44"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"--1", "<sample:10>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"line.separator1e10"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("line.separator1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"2020-01-01", "<sample:10>", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "a", "4", "<sample:3>", "34", "-1073741899", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "1073741818"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"G0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=G0, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"1.1234568", "<sample:14>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:0>", "-1073741824", "-2147483572", " <"}, {"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"Thtle"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=Thtle, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "77", "!I!"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "[1>,2]", "<sample:0>", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2147483647, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<empty>", "-2147483648", "-536870911", "<a>b</`>1E-5"}, {"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "115f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=115f, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"8263", "010", " |!", "<sample:4>", ".5Hello, World", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "00x1F"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=00x1F, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:5>", "2147483647", "<a>b</aP> <{\"a\":1}[1,2]"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "1073741736"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1073741736}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"139233", "", "010+1ux1F", "<sample:0>", ""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "-10", "<a>b</aP> <{\"", "-,-1.5", "<sample:6>", "-1", "2", "argusage: "}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"74", "arg", "<sample:1>", "0xFFFFFFFF"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "-74", "arg", "1.123D567", "<sample:1>", "3", "-37", "\t5-1", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "a,b,c", "1073741781", "-68"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "-34", "0x1F", "Hello Xorld", "<sample:0>", "-1073741793", "74", "`", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-16"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "-130999", ">>", "TITLE", "<sample:0>", "-2147483648", "1", "\t"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "74", "<sample:1>", "56", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "-1", "{\"a#:1}", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"1.B1244567890123456", "<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{">"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<null>", "-2147483648", "-2147483648", "PT1H"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"0", "lime.separator", "<sample:1>", "1.5", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "010+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=010+1, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ">"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=>, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=\u00e9, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"+", "<sample:9>", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "1L", "3", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "<sample:9>", "75", "524278"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"Hello+ World | "}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:0>", "60", "<null>", "2147483647", "56"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "16777290"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello+ World |", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=16777290}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"!"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "A2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=!, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "7", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:4>", "34", "0x1F", ">=", "<sample:10>", "-1073741824", "-2147483648", "H0", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=null, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "0E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=0E-5, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{" b "}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "="}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix= b , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"a b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=a b, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=-0.0, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2147483647", "1.12345678", "1.5\neo00", "<sample:9>", "nulla_b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "-65499", "<sample:6>", "67", "2"}, false), new String[][]{{"substring", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1073741818", "0x123456789", "aac", "<sample:1>", "2"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "4", "", "1E-5", "<null>", "<a>b</aP>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"010+1", "1.5f", "<sample:7>", "\037<"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:1>", "49", "1L5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"11e10"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<empty>", "2147483647", "-73", "lime.sepaqator"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "102", "1..5d", "1.1234567", "<sample:11>", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=11e10, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "33423561", "-2147483640", "H0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("H0 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"1.8\neo00"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:4>", "1073741818", "-."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.8\neo00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "22", "/5\t"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "1K\u00e9", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "30", " | 0xFFFFFFFF", "[1.-5d", "<sample:9>", "-2146959360", "-2147483648", "PT1G", "false"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "-2", "K", "1.123456789012346567", "<sample:4>", "-130999", "524289", "2020-02-30T24:61:61]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "34"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"Title<a>b</a>", "2147483647", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{".5["}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5[", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:5>", "30", "2474x83648"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}, {"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "010+1", "1073741823", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "12:30:45010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=12:30:45010, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "10", ">>-"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-34"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:1>", "-2", "<sample:10>", "4", "71"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-4"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-4, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=-0.0, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "-35", "g1i"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"4"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("    ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"a"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "-130999", "<sample:5>", "74", "-2147483648"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1L, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "75"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=75, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"eTITLE"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:6>", "-2147483648", "<sample:3>", "-2147483648", "36"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=eTITLE, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-1073741855"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "+", "\u00e9", "<sample:4>", "-r-1", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-1073741855, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"  "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=  , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-1073741876", "A22", "\u00e8", "<sample:9>", "", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"75"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=75, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "2177", "A2\u00e9"}, false), new String[][]{{"length", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<empty>", "20", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"usage9 "}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=usage9 , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:4>", "8519684", "1.12345778", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2147483647, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"3"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "1e10", "1F.123456781.5e300", "<sample:13>", "_1e1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "536870942", "-65499", "2147483648"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", " ", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("2147483648 {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"73"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                         ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"30"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<empty>", "-4", ">=H", "<sample:13>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=30, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"arg1.5e300", "10", "45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", ">g"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=>g, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "2147483647", "-2", "99"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<null>", "102", "-1", "b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"60"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=60, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"4"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=4, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<null>", "8388609", "3", "L>-1.5e300"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"I", "!usage: ", "<sample:0>", "a b", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=4, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "0", "131234567890123456"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("131234567890123456 {length=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "2147483647", "nuola6b", "", "<null>", "118", "60", "=", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2147483647", "[n1{2]", "T_tle1.1234567", "<sample:7>", "0M"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "2147483647", "010 ", "0x12344679", "<sample:2>", "-1073741781", "-75", "ine.separator123456789012345678901234567890"}, {"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "!!"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=!!, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{">>-0.0"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<null>", "-1073741818", "1048501", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">>-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"0x1234567892020-01-01", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2147483648\u00e9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2147483648\u00e9, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "-98", "[", "Hell\t+ World | ", "<sample:5>", "-2147483648", "2147483647", "1.B1144567890H234P", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "86", "<sample:9>", "10", "34"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"Hello0 World | "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello0 World |", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"-2]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"020", "01012", "<null>", "  "}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-1073741824"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:4>", "-33554372", ".5", "<sample:11>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-1073741823"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<empty>", "131101", "1 !"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.25, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"66"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "1.123456789012345671", "0x12344679", "<sample:2>", "1H0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=66, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "135266363", ".5-- | ", "<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName= , getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<empty>", "-2147483648", "1.B1244567890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<empty>", "1073741818", "<sample:10>", "57", "2121"}, false, 1, new String[][]{}), new String[][]{{"append", "double", "4"}, {"lastIndexOf", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-536870839"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-536870839}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{">."}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:3>", "-1073741816", "-22", " 1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=>., getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:5>", "-73", "-75", " x "}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"71", "a", "ar", "<sample:4>", "12:30:45<a>b</a>", "true"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"lime.eparator"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=lime.eparator, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"114f", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1.5e300, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "2147483594", "<sample:6>", "-54", "262235"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"74", "", "\t\t", "<sample:2>", "a,b,,c", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"PT1H", "a b", "<sample:13>", ".  a a12:30:45", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "!"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=!, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "34", "\n", "1.5", "<sample:2>", "50", "28", "1e0", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"<a>b</a>\n", "<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"", "<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "71"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"59"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=59}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"-1.5Hello, World"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"5-W"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=5-W, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "2147483647", "4", "a,c,c <"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:5>", "130", "<null>"}}), new String[][]{{"substring", "int,int", "7"}, {"insert", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("a,c,1.0c < {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "00i1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=00i1F, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"="}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix==, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1.5f, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"80"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=80}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "118", "-1073741824", "srue."}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<empty>", "32693", "A2"}}), new String[][]{{"appendCodePoint", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplesrue.\001 {length=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=null, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-1.5, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "150", ">>A", ">].", "<sample:1>", "1", "-75", "12:30:45--1", "true"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<empty>", "-2", "", "Hello, World", "<sample:6>", "-4", "2147483647", "74", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-1073741781"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-1073741781, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "73"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=73}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-75"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=10}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"127005", ",", "", "<null>", ".41.1234567890123456", "false"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "60", "3", "010+:", "<sample:8>", "187", "-2147483648", "T_tle1.1234567a<a>b</a>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"1.50x123455789"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=1.50x123455789, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"Z"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=Z, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"74"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=74, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "-1", "true-", "!b", "<sample:4>", "-2147483648", "-1073741824", "11.2", "false"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"67", "1e1/", "3", "<sample:12>", "1.1234567890223456<a>b</a>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483635", "l5", "1--1", "<sample:13>", "PT1H", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.5e300, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<null>", "536739903", ".  a b1.1234567", "I<", "<null>", "-1", "-2147483648", "a,bL,ca b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "u"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=u, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "30", "D"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "u", "<sample:6>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"<a>b</aP> <{\"a\":1}]", ".B114456780H23456", "<null>", "lime.stparator", "false"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1073741818", "line.separator", " | ", "<sample:0>", "5.", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "37"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=37, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"-0.0--2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "16777546", "1..-5d", "742e10", "<sample:8>", "0x123456789", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=-0.0--2020-01-01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:6>", "-2147483648", "34", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-3"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1073741823", "010", "1.123456778", "<sample:1>", "-", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "148", ","}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:4>", "16842791", "", "usage: 1", "<sample:10>", "56", "75", "lime[separauor"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"]"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1f.B1244567890123456"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1f.B1244567890123456, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=], getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-4, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "1", "-4", "a:gTitle"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "4", "<sample:2>", "52", "73"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"", "0.25 ", "<sample:5>", "X.5", "true"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "0L"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"\n"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=\n, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{":"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=:, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "0", "<sample:4>", "-89", "-1073741824"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483647", "nuola6b", "t;ue", "<null>", ".5\n", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"60"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                            ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x123456789", "-118", "75"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "75", ""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"10", "1L", "nuola6b", "<sample:7>", "TITL E", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<null>", "30", "-1073737722", "110 "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "1020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=1020-02-30T25:61:61, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"65499"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "us.age: ", ">=--1Title", "<sample:0>", "21120-02-30T25:61:61"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=65499, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:5>", "-75", "<sample:2>", "56", "-56"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-67108790"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-02-30T25:61:61"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"H0", "<sample:13>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<empty>", "8194", "TICTLE"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "73"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=73, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=0, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-6"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:1>", "4", "1"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "-33", "0xFFFFFFFFTitle", "21.5d", "<sample:0>", "-1073741823", "-2", "01101"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-6, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "29", "1", "0x1F{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=true, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{".51.5", "5.", "<sample:6>", "0xFFFFFFFF", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "  "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=  , getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=1.5, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"2020-01-0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "6", "Hello+ World | "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"-."}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=-., getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "4", "<a>b</aP> <{\"a\":1}"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "4194356", "1.235678", "2", "<sample:4>", "line.sfpa"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "2147483647", "3", "<sample:11>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-7"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-7, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1x12344679"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1x12344679, getNewLine=\n, getOptPrefix=1.5d, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"1.-5ne"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "34"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.-5ne", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=34}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<empty>", "131101", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "74ca,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=74ca,b,c, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "lime.separator-"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "{\"a\":1}"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName={\"a\":1}, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-1073741823}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-1073741781"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-1073741781, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"1LI", "-2147483648", "-16"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "PT1H", "-1073741832", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "2147483647", "-"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-[11.5f", "a", "<sample:11>", "2L", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"118"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=118, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"--", "1.5d", "<sample:0>", ".", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:7>", "2147483647", "-0/0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "2020-01-010"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=2020-01-010, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"Hello, World-1.5"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=Hello, World-1.5, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "2147483647", " ", "1.1-34567", "<sample:11>", "-1", "2147483647", "1.25", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:5>", "16", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "-130999", "<sample:2>", "524287", "2"}, false, 4, new String[][]{}), new String[][]{{"append", "java.lang.StringBuffer", "7"}, {"append", "float", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Infinity {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:0>", "59", "1e"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:4>", "-75", "<sample:13>", "112", "-2145386496"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"*]"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=*], getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=I, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"[1,2]", "<sample:17>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "4", "<sample:13>", "2147483647", "32"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=Hello, World, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "-1073217530", "<sample:9>", "2", "16777290"}, false), new String[][]{{"append", "char[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.B1244567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=1.B1244567890123456, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"\t", "<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-2147483646", "01/ ", "a,b,d", "<sample:11>", "1.5d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"1.1233567890123456"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=1.1233567890123456, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=0.5, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\"91}1.12345678", "2147483647", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<empty>", "139", "T tme"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=I, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-1610612736"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:0>", "75", "<sample:10>", "48", "-17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-1610612736, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "2147483647", "Wrue", "2020-01-01", "<sample:1>", "-1073741823", "1048635", "Helmo, Worl"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "10", "-131009", "a b"}, false, 0, null, 1), new String[][]{{"offsetByCodePoints", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"71", "", "W", "<sample:6>", "["}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"2020-01-0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2097208", "-0.0", "us6age: ", "<null>", "1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-2147483562"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=a b, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"UITLE", "16777785", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "74"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=74, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:5>", "2147483647", "2020-01-0", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=true, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "10", ">="}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=1, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"155d", "/10", "<sample:7>", "W10"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", " <"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName= <, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
}
