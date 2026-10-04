package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "268435458", "-2147483648", ""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "3"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=3, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "-2147483648", "<sample:5>", "1097", "0"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "7", "<sample:3>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "3", "arg", "<a>b</a>", "<sample:3>", "2", "74", " "}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "15", "<sample:4>", "-1073872930", "75"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{o\"0\"", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "2147483647", "1.5f.", "\t", "<sample:1>", "74", "268435458", "<"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2", "", "line.separator", "<sample:5>", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:1>", "8", ",7.41.123456781.5d2020-01-01", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-01-01"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "3", "<sample:7>", ":<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-01-01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "[+"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "1e10", "{\"0\"", "<sample:4>", "arbb", "false"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "-1", "1097", " "}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[+, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"3", "\t", "-0.0", "<sample:3>", "+"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}, {"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:1>", "-2147483648", "4", "5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2147483647, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"\t", ">", "<sample:7>", "5.", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "null"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "+"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=+, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=null, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2", "6\r12:3/:451D-51.1234567890123456", "` b:", "<sample:2>", "20.5D\n\n0FFFFFFFF5."}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "1.12345678", "1L", "<sample:5>", "1.5f."}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "29"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:1>", "37", "2g47483648", "lline.separator", "<sample:4>", "0", "148", "{o\"0\"arg", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=29, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"268435458"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "<null>"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=I, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=268435458}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-268435458", "<sample:4>", "73", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "6", "<sample:3>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "<sample:5>", "0", "0"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "7", "<sample:3>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "6", "arg", "<a>b</a>", "<sample:3>", "2", "74", " "}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "<sample:5>", "-27", "0"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "7", "<sample:3>", "true"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "6", "arg", "<a>b</a>", "<sample:3>", "2", "74", " "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<empty>", "-2147483648", "<sample:6>", "-27", "-39"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "7", "<sample:6>", "true"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "6", "arg", "<a>b</a>", "<sample:3>", "2", "74", " "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-1073872952", "<sample:6>", "-2147483648", "-2080374784"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{\"a\":1}", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "PT1H", "<sample:2>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "-1", "10", "\n"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "75"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"\t", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "2147483647", "<sample:6>", "0", "75"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-02-30T25:61_:61"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{o\"0\"", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "2147483647", "1.5f.", "\t", "<sample:1>", "74", "268435458", "<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-02-30T25:61_:61, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "-2147483648", "<sample:6>", "0", "75"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "Title"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{o\"0\"", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=Title, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "74", "<sample:6>", "0", "75"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-02-30T25:61_:61"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{o\"0\"", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "73"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-02-30T25:61_:61, getDescPadding=73, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:5>", "148", "<sample:6>", "0", "111"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-02-30T25:61_:6o"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "   ", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-02-30T25:61_:6o, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:5>", "148", "<sample:6>", "0", "111"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ".5"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:2>", "-1073872930", "1"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "   ", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=.5, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "148", "<sample:5>", "1097", "-222"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<null>", "-1073872930", "5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "74", "123456789012345678901234567890", "--", "<sample:4>", "1L"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "  ", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"74"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=74, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "-222", "1.12345678901234567", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "2147483647", "<sample:0>", "-268435458", "4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "73"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:1>", "2147483647", "1.134567X8901234567", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:4>", "294", "1.1345_7X8901234567", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "010", "<sample:2>", "1097", "0", "TITLE", "false"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=2147483648, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "16776590", "LD9   ", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "3"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:2>", "1097", "-1", "TITLE", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=3, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:5>", "16776531", "1LD9   I", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "["}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:5>", "1097", "-1", "TITLE", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=[, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:5>", "16776531", "1LD9   I", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "148"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:5>", "1097", "-1", "TITLE", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=148, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:5>", "16776531", "1LD9   Iarg", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-2147483136"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:5>", "1097", "-2147483648", "TsITLE", "false"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "1154"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-2147483136, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "16760403", "1LD9   Iarg", "<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:5>", "1097", "-1073741824", "TsITLE", "false"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-33520806", "1LD9   Iarg", "<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-2147483136"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:5>", "1097", "-1073741824", "TsITLE", "false"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"[", "2147483647", "-222"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "<a>b</a>", "74", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "67287327", "=W", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "r[", "/10", "<sample:5>", "2", "-536870931", "abca", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-2080374784", "=", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "r[", "/10", "<sample:5>", "2", "-536870931", "abca", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=a,b,c, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1L", "-1", "<sample:6>", "<", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "268435458", "74"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "\u00e9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=\u00e9, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "1879048190", "A+", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "--", "<sample:5>", "<"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "truf", "<sample:0>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"Hello, World", "   ", "<null>", "0", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "2", "", "<null>"}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "--{G1,2]a", "<sample:5>", "<<"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:1>", "8", ",7.41.123456781.5d2020-01-01", "<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2:020-01-01"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "3", "<sample:7>", ":<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2:020-01-01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "8", ",7.41.123456781.5d2020-01-01", "<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2027-01-01"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "3", "<sample:7>", ":<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2027-01-01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "8", ",7.41.123456781.5d2020-01-01", "<sample:4>"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "--"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "3", "<sample:7>", ":<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=--, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "8", ",7.41.123456781.5\u00e92020-01-01c", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-01-001"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<null>", "1097", "-1.5", "a,b,c", "<sample:5>", "-2147483648", "10", "\n", "false"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-", "3", "<sample:7>", ":<"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-01-001, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "8", "023>457801234567--0x1Fusage: ", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-1", "-.c", ".", "<sample:4>", ":=5."}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", ""}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "37"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-2"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"E!!"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "1.25", " ", "<sample:1>", "1.5f.", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=E!!, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "1.25", " ", "<sample:1>", "1.5f.", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=-1.5, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-222", "74", "0x1F", "<sample:6>", "1L", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "010", "268435458", "15"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "74"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483647", "74", "0x1F", "<sample:6>", "|1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "010", "134217729", "15"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "74"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483647", "74", "0x1F", "<null>", "|1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "74"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:6>", "2", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:1>", "2", "12:30:44"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=1.25, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"125"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=125, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"15"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=15, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"["}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=[, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"Z"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<null>", "73", "<sample:6>", "-1073872930", "3"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=Z, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"1", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "h"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=h, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"null", "<sample:4>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"ntl", "<sample:4>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=5, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"ntl", "<sample:4>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-01-01"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-01-01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"   ", "<sample:4>", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "2020-01-/1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=2020-01-/1, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"!:", "<null>", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:2>", "268435458", "30", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"75"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=75, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{".5", "4", "75"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"5", "4", "-75"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"5", "4", "75"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=123456789012345678901234567890, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=4}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"148"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=148}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"296"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=296}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"+1", "i", "<sample:6>", "74"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "I", " | ", "<null>", "123456789012345678901234567890"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"", "<sample:1>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "74"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "4", "a", "\t", "<sample:6>", "1.5f.", "false"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "PT1H", "<sample:6>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-1073872952"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-1073872952, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=+, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=10, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-52"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-52, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"8140"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=8140, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-4070"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-4070, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-4134"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-4134, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "2", "-2147483648", "+1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "268435458", "-2147483648", "+"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=0, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "268435458", "-2147483648", "+"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "268435458", "-2147483648", "+"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "268435458", "-2147483648", "+"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-2147483648", "3", "1E-5", "<sample:0>", "TITLE", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[1,2], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"[1,1]"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[1,1], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"[,1]"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[,1], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"[,1]   "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[,1]   , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"[1]   "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[1]   , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "268435458", "<sample:0>", "73", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-268435458", "<sample:5>", "73", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-268435458", "<sample:5>", "73", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "5.", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-268435458", "<sample:5>", "73", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-268435458"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "5.", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-268435458, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "75", "null", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-268435458", "<sample:4>", "73", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "5", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "0", "<sample:6>", "2", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"010", "-268435458", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "-2147483648", "<sample:4>", "1097", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "6", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "-2147483648", "<sample:3>", "1097", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "PT1H", " | ", "<sample:4>", "1E-5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "6", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "-2147483648", "<sample:5>", "1097", "0"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "7", "<sample:3>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "3", "arg", "<a>b</a>", "<sample:3>", "2", "74", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{" | "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "268435458"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= | , getWidth=268435458}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "4"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "75", "<", "--1", "<sample:5>", "1097", "-2147483648", "1e10", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=PT1H, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=TITLE, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "-1073872952", "<sample:6>", "-2147483648", "-2080374784"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{\"a\":1}", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "1", "<sample:6>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "PT1H", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-1", "null", "\n", "<sample:5>", "2020-02-30T25:61:61", "false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}, {"org.apache.commons.cli.HelpFormatter", "getArgName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1L, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "75", "<sample:0>", "-1073872952", "268435458"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=0xFFFFFFFF, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-1073872930"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "1.5", "TITLE", "<sample:1>", "Title", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-1073872930, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.5, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:1>", "74", "a", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:2>", "268435458", "\n", "-", "<sample:2>", "3", "10", "   ", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=3, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-2147483648", "PT1H", "   ", "<sample:5>", "1.12345678901234567", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=-, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=1.12345678901234567, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"Hello, World", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:1>", "-243", "1.134567X8901234567", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:6>", "8388356", "1.1345_7X8901234567", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "010", "<sample:2>", "1097", "0", "TITLE", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:2>", "8388295", "LD9   ", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:2>", "1097", "0", "TITLE", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.12345678901234567, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "8388295", "LD9   ", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "3"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:2>", "1097", "-1", "TITLE", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=3, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "8388295", "LD9   ", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "32020-01-01"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "[", "/10", "<sample:2>", "1097", "-1", "TITLE", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=32020-01-01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<null>", "-2147483648", "1097", "a,b,c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "line.separator", "74", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-1073872930", "  ", "2147483648", "<sample:4>", "0x123456789", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "-"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", " | "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= | , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"1.5", "<sample:0>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "-1073872930", "3", "[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=12:30:45, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"{o\"0\""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix={o\"0\", getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "67287327", ">", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "4", "r[", "/10", "<sample:5>", "2", "-536870931", "abca", "false"}, {"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{">"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=0, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1.12345678901234567, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"Title", "--1", "<sample:0>", "0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-2080374784", "I", "3", "<sample:7>", "usage: "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"<"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=<, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "73", "", "74", "<sample:7>", "-2147483648", "148", "i"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=5, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}), new String[][]{{"reversed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "2", "-2080374784", "010"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-268435458"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483648", "0", "<sample:7>", "--", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "1.5f."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=1.5f., getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.12345678, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<null>", "74", "-222", "2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=[1,2], getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "0", "<sample:4>", "148", "74"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "75", "1097", "1.1234567890123456"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.1234567890123456 {length=18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=0, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=a b, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "75", "1097", "Hello, World"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("Hello, World {length=12}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=0x1F, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1073872952", "7", "1.1234567", "<sample:7>", "12:30:45"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<empty>", "-222", "true", ".5", "<sample:7>", "3", "-1073872930", ".5", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "0xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=4, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=PT1H, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "2147483647", "a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=true, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "2147483647", "a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=I, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "2147483647", "a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "J"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "1", "-", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=J, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "2147483647", "a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "1", "-", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-268435458"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-268435458, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-134217730"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-134217730, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"134217730"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=134217730, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"12:3\n:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3\n:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"12:3\nt45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:3\nt45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "-53", "tsu"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "1073741789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<empty>"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix= , getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"\n "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<empty>"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=\n , getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"\n\n "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<empty>"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=\n\n , getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "a", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<null>", "148", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=abc, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"abd"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "a", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<null>", "148", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=abd, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{";"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=;, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"0", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=i, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"1", "<sample:2>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "h"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=h, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"1", "<null>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "h"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:0>", "73", "<sample:3>", "2147483647", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=null, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=.5, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "-222", "I", "3", "<sample:6>", "15", "3", "<a>b</a>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"123456789112445678901234567890I", "<sample:4>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-111"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:3>", "-67108854", "<sample:6>", "-2147483648", "1097"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "202f0-0A-0r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=202f0-0A-0r, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"123456789112445678901234567890I", "<sample:4>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:3>", "-67108854", "<sample:6>", "-2147483648", "1097"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "20f0-0A-0r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=20f0-0A-0r, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"123456789112445678901234567890I", "<sample:4>", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:5>", "-67108854", "<sample:6>", "-2147483648", "1097"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-1073872952"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "20f0-0A-0r"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"5", "4", "75"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=123456789012345678901234567890, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"5", "4", "76"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "123455789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=123455789012345678901234567890, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=10}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"2147483135"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:3>", "15", "-1073872930", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483135}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:3>", "15", "-1073872930", "2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-1073741824}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"1E-5", "1", "-222"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=[1,2], getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "[1,2W"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=[1,2W, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"", "<sample:0>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "74"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=2020-01-01, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "-1073872930", "Hello, World", "Title", "<sample:2>", "-268435458", "0", "1"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", ":<"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=:<, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "-1073872930", "Hemlo, World", "Title", "<sample:2>", "-268435458", "0", "1"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", ":;"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=:;, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:2>", "-1073872930", "Hemlo, World", "Title", "<sample:2>", "-268435458", "0", "1"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", ":;;"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=:;;, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "abc"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "0x12345689"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=0x12345689, getNewLine=abc, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2", " | ", ":<", "<null>", "-1.5", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "73", "1097", "010"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "148"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("010 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "73", "1097", "010"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "0"}, {"org.apache.commons.cli.HelpFormatter", "getArgName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("010 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=0, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:6>", "73", "1097", "010"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "0"}, {"org.apache.commons.cli.HelpFormatter", "getArgName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample010 {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=0, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "<", "<sample:1>"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "10", "-222", "74"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "P<", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"3", ".5", "<sample:1>", "a", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"Hello, World", ".51.1234567", "<sample:4>", "ba", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"HHe+lo,!W3rda", "", "<sample:4>", "u\u00ea", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2147483647"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-222", "-1.5", ",7.41.123456781.5d2020-01-01", "<sample:2>", "{o\"0\"", "false"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:2>", "-222", "-268435458", "Title"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{" | "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" |", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{" | 2"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "1L", "-268435458", "10"}, {"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" | 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "-2147483648", "a,b,c"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "75", "0x123456789", "--", "<sample:1>", "1.1234567", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}), new String[][]{{"thenComparingInt", "java.util.function.ToIntFunction", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1.5e300", "u-0.cTfslc", "<sample:4>", "{\"b\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1.5e300", "u-0.cTfslD", "<sample:4>", "{\"b\":1}"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<null>", "148", "148", "74"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<empty>", "-2080374784", "15", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1b.5e300", "12:30:452147483648", "<sample:4>", "CCz\"\":t1}PT1H"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=null, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1b.5e300", "12:30:452147483648", "<sample:4>", "CCz\"\":t1}PT1H"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=null, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"12:30:45", "2147483647", "74"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483575", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1b.5e300", "12:30:452147483648", "<sample:4>", "_Coz\":"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=null, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1\u00e9b.5e300", "12:30:452147483648]", "<sample:4>", "_oz;\"\":"}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "a b"}, {"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", " 1.5f"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=a b, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<empty>", "75", "1097", "0xFFFFFFFF"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0xFFFFFFFF {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=], getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1\u00e9b.e300a,b,c", "12:30:45147383648]", "<sample:4>", ""}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "148", "\t"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=2020-02-30T25:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1\u00e9b.e300a,b,c", "12:30:45147383648]", "<sample:4>", ""}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "148", "\t"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "20220-02-30T25:61:61"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=20220-02-30T25:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1\u00e9b", "12:30:45147383648]", "<null>", "[1,2]"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:3>", "148", "\t"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "20220-02-30T25:61:61"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1\u00e9b", "1.5e300", "<sample:4>", "[1,2]"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "202220-02--30T25:61:61"}, {"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:2>", "-1073872930", "73", "arg"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=202220-02--30T25:61:61, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x1F", "-268435458", "-1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "8", "74", "74"}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:2>", "15", "<sample:0>", "1", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435459", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"a", "<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ">"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=>, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"abc", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "1097", "PT1H", "-1", "<sample:7>", "\u00e9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"ix1F", " | 1.5300", "<sample:4>", "e..P"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<null>", "-1073872952", "Hello, World", "line.separator", "<sample:3>", "8", "2147483647", "1.5d"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268435417", "a+c", "--1", "<sample:4>", "2020-01-01 ", "true"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-268435458"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "8", "+"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "-1", "12:30:45", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"+ix1F", "!|t!1.5300", "<sample:6>", ""}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:1>", "-1073872952", "Hello, World", "line.separator", "<sample:3>", "15", "2147483647", "1.5d"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268435417", "a+c", "--1", "<sample:4>", "2020-01-01 ", "true"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-134217729"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"+ix1E", "1.12345678", "<sample:1>", "line.separator"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268435417", "a+c", "--1", "<sample:4>", "2020-01-01 1", "true"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.1234567"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1.1234567, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"+ix1E", "1.12345678", "<sample:1>", "line.separator"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268435417", "a+c", "--1", "<sample:4>", "2020-01-01 1", "true"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.1234568"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1.1234568, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"+ix1E", "1.1+345678", "<sample:2>", "line.separator"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268435417", "+c", "--1", "<sample:4>", "2020-01-01 1", "true"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1x1234568"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1x1234568, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"+hx1E", "1.1+345678", "<sample:2>", "line.separator"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268435417", "+c", "--1", "<sample:4>", "2020-01-01 1", "true"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.1235568"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1.1235568, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<empty>", "75", "<sample:7>", "8", "0"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "Hello, World"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--1, getLongOptSeparator= , getNewLine=Hello, World, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "1097", "a b"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1.12345678901234567", "", "<sample:0>", ""}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "3"}, {"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268437448", "12:38:45", "--1", "<sample:4>", "2020-01-01 1-1", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=3, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "1097", "true"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine= , getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"{\"\"a\":1", "I0xFFFFGFFF", "<sample:6>", "L"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "a,b,c"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268437448", "12:38:45", "-<-1", "<sample:4>", "2020-01-01 1-1", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a,b,c, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"{\"\"a\":1", ">>[1,2]", "<sample:5>", ",7.41.123456781.5d2020-01-01"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "a,b,"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268437448", "1:2:38:45", "-<<-1", "<sample:4>", "1.12345678", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a,b,, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-1", "<sample:4>", "2", "15"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.5d, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"{\"\"a\":1", ">[1,2]", "<sample:6>", ",7.41.123456781.5d2020-01-01"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "a,b,"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268437448", "1:2:38:45", "-<<-1", "<sample:4>", "1.12345678", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a,b,, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"{\"\"a\":1", ">>[1,]", "<sample:6>", "5"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "a,b"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "268437448", "1:2:38:45", ".<<-1-1", "<sample:4>", "1.12345678", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a,b, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"{\"\"a\":2", "2147483648", "<null>", "5"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "`,b"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "536874912", "1:2:38:45", ".<<-1-1", "<sample:4>", "1.12345678", "true"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "vsage: "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "2147483647", "7", "1E-5", "<sample:2>", "0", "1", "2147483648", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"a", "Hello, World", "<null>", "1.5"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "`,b"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "536874912", "1:2:38:45", ".<<-1-1line.separator", "<sample:4>", "1.12345678", "true"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "Bvsage:  5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"  ", "-268435458", "-1073872930"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1342308388", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.5d, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"{o\"0\""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix={o\"0\", getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"   "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-2147483648, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "{o\"0\""}, {"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "1.1234567890123456", "-1073872930", "-222"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator={o\"0\", getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "--"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=--, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "148", "<sample:4>", "75", "4"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "3", "<sample:4>", "75", "4"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "75", "a"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:0>", "3", "<sample:3>", "2147483647", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:4>", "2", "<sample:4>", "75", "33554436"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "--"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=--, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"<null>", "null", "<sample:2>", "\n", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-134250507"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "  ", "a Eb", "<sample:4>", ".5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-134250507, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-268501014"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-268501014, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-268500977"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-268500977, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "-2080374784", "-1073872930", "a"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}, {"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "3", "2", "1097"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=true, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "tque"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "134217729", "TITLE", "1.5", "<sample:0>", "["}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=1.1234567890123456, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=\t, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<empty>", "73", "8", "1.5"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "1.12345678901234567", "1.25", "<sample:7>", "Title"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<null>", "536870916", "<sample:4>", "-268435458", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-222"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "8", "<sample:3>", "-268435458", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-222, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"148"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "8", "<sample:3>", "-268435458", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=148, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"74"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=74, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-148"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-148, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-296"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-296, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"[1,2]", "-1073872930", "10"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:2>", "-222", "1097", "usage: "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073872920", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"[M,2]3", "-1073872930", "-131062"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1074003992", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"[M,2]3", "-1073872930", "-131062"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1074003992", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "2", "10", "0x1"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"]"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "2", "10", "0x1"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=], getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"u]]"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "2", "10", "0x1"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=u]], getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"v]]"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "2", "10", "0x1"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=v]], getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"v]]\u00e9"}, false, 16, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "2", "10", "0x1"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=v]]\u00e9, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
}
