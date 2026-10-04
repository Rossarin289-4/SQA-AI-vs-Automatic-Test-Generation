package generated.algorithm;

import junit.framework.TestCase;

public class BinaryParticleSwarmGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "   ", "-574", "<sample:4>", "1.1234567790123456", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2147483647, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<empty>"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-8388604"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-8388604, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"12;30:45   "}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=12;30:45   , getWidth=2}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"<null>", "\u00e9744+1", "<sample:9>", "--s", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:0>", "-67108799", "<sample:9>", "-2147483616", "1179651"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:4>", "134217732", "<sample:4>", "-2113929184", "262179"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-57a b", "\n[", "<sample:6>", "", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:4>", "-2113404896", "\t", "QV1H", "<sample:7>", "-2147483555", "63", "1.5e3e00 "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "10", ".51-12345678", "1.1\t2345678901234567", "<sample:2>", "-2147483648", "-51", ""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "773", "4", "-2147483616"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"\t1.124456\n8", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1.4f", "1X.5line.separator", "<sample:6>", "..5"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", " | "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix= | , getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<null>", "8388610", "1.1/2345678\n", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2", "-p-s", "TITLDX", "<sample:4>", "12:30:45a,b,c"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "55.", "", "<sample:6>", "<Title", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"\n--1", "75", "-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"-[", "<sample:8>", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:4>", "-2147483648", "", "1.", "<sample:6>", "262179", "74", "/x1G", "false"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "a,b,c2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=a,b,c2147483648, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<empty>", "1179651", "1.24", "0x1F", "<sample:2>", "134217732", "0", "20\"20-801-01"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=7, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"3line.sepa6ator"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "-2147483647", "2113404851", "1.1244556\n8"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<empty>", "2147483647", "0x1F"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=3line.sepa6ator, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "10", "<sample:3>", "-2147483616", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:3>", "268435448", "43", "Hcllo, WWorld"}, {"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-134217727"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "["}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=[, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-134217727}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"0F12345689"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=0F12345689, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"."}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=., getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"0", ",b,c", "<<", "<null>", "--1", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"12:", "<sample:7>", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "38", "<sample:0>", "73", "4194306"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-268435493", "081234a5689", "-574P", "<sample:2>", "0x0Gnull"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:0>", "126", "PTA1tH"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"65684", "", "<", "<sample:8>", ".a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<sample:1>", "15", "<sample:0>", "-2147483638", "-2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=1.1234567, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"20\"20-01-01line.separator"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=20\"20-01-01line.separator, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{" |"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix= |, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-67108863"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"52", "3<", "<sample:2>", "73123456789012345678901234567890"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "134217798", "-134217764", "a b+1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "-2147483648", "2147483647", "-1abc"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<null>", "52", "<sample:0>", "-12", "-48"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "1L", "35", "2147483647"}, {"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "1D-5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-134217727"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "0x1F"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-134217727, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=0x1F, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"1.123456T7874"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.123456T7874, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"E b", "0.", "<sample:5>", "-574]", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "-54", "-|7"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "Hello, World2020-02-30T25:61:61Hello, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.5e300 ]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=1.5e300 ], getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"\u00e9", "0x11.5f", "<sample:3>", "--"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", ""}}, 1), new String[][]{{"reversed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"ab", "-2147483648", "16"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483632", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"[", "<sample:5>", "false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"thenComparing", "java.util.Comparator", "3"}, {"thenComparingDouble", "java.util.function.ToDoubleFunction", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{" | ", "\r\\", "<sample:7>", "--:", "false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2147483647", " |\037", "usage: a,b,c", "<sample:5>", "73", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"PLT1H", "2147483647", "-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=0, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "-115", "<12:30:45", "2020-X02-30T25::61:61", "<sample:8>", "-20", "134217598", ".--0.0", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "QV|H"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "11", "usage: "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"35"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                   ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"402653192"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "--.1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=402653192, getLongOptPrefix=--, getLongOptSeparator=--.1, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-1056702448"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "bc", "", "<sample:3>", "21474836482147483648", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-1056702448, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2147483555"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2147483555, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "0", "<sample:3>", "-2147483555", "33554430"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "1.123456789/123456", "<sample:9>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"0F12345689E", "1.12345678", "<sample:1>", "44", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "589794", "-0.0a,b,c", "P[1,2]", "<sample:4>", "-2113929236", "-2113929242", "1.1234568", "true"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "<"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "16777215", "", ".51-12345678", "<sample:1>", "-8", "-2147483648", "1e0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "-1", "-1.6", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"o10x123456789>", "80", "254"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-45", "12:30:451.123\r45678", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "15", ",7", "0>", "<sample:10>", "0x1F3"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-", "-574 ", "<sample:5>", "51"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"1e10", "-67108799", "16777237"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-50331562", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:1>", "-268435464", "].5d"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<empty>", "134217727", "Er574.5"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"QV\"{", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "12:30:491"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=12:30:491, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"05-1", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1250"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1250, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{".51-12345678", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "-1056964592", "1", "   ", "<sample:6>", "-2113404904", "2114191328", "Ttle", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"thenComparing", "java.util.function.Function", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"]"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=], getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"", "<sample:0>", "true"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "52", "<sample:0>", "-46", "52"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"7+"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:3>", "16777220", "1X.5", "true", "<sample:5>", "-2113929184", "106", "Ftrue>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=7+, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"", "12:1L", "<sample:11>", "+1"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "-74", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "-11.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"", "-|", "<sample:7>", "1E-5"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:5>", "-67108891", "-1X.5"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"", "TITLE0", "<sample:0>", "g7", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "74--1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"ab ", "<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String", "<sample:1>", "-2147483648", "15>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"48", "QU1H", "1.123456T78", "<null>", "5-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"1.123456T7874", "0x1G", "<sample:0>", "1.5e3e00"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2"}, {"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "16777215"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"0x12345689", "2147483647", "-2"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-2147483648", "TITLE", "urage: ", "<sample:0>", "P\t1H", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "Title", "<sample:4>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "2147483616", "null"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "-94", "53", "1.5e30}0"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:2>", "2147483647", "TITLE1.12345678901234567", "0x123456789", "<sample:4>", "511", "296", "15>2147483648", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"TITLE1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=TITLE1, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"150"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:3>", "-1", "PT2H-", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "*1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                                                                                                      ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=*1, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "-2147483620", "Hello, World", "\u00e9", "<sample:4>", "2147483647", "262246", "0"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-2147483616"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "-134217729", "J"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"01{0", "78", "2147483647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483571", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "14", "-1073741821", "1/26"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"75", "20\"20-01-01", "", "<sample:9>", ",0", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"   ", "12.1234n678", "<sample:0>", "0F12345689", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "537395199", " | 2", "/x1F", "<sample:2>", "-134217727", "24", "Hello, Workd"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "{\"`\":1}   ", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "2", "-4", "-1X.5"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:1>", "73", "<sample:2>", "-11", "2"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "[", "<sample:1>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"1.5", "<sample:6>", "true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:2>", "2147483647", "51", "\u00e974+1", "<sample:6>", "63", "10", "74"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<empty>", "146", "6", "nuull"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("nuull {length=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"35", "12:", "1.12345778901234567Hello, World", "<sample:11>", "5-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"13"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("             ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"1X.5"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "-39", "2", "-574 "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=1X.5, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"15 "}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=15 , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.1234567", "2147483647", "146"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "2", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483503", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "2147483647", "0x1Fa b", "<sample:9>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-57", "o10x123456789", "<sample:3>", "    "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"", "a b", "<sample:6>", "010"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "-2147483648", "-X.5", "1M", "<sample:4>", "-2147483648", "67108899", "ab ", "true"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"-1i"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=-1i, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"[1,2]Hello, World"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=[1,2]Hello, World, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"usagee: "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=usagee: , getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=48, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"12345678901345678901224567890"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=12345678901345678901224567890, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"20\"20-01-"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=20\"20-01-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "   ", "Z", "<sample:12>", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"-0"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "2147483647", "", "us", "<sample:10>", "-2147483648", "55", "0w2F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=-0, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"-00.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=-00.0, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-1073741824", "nullTITLE", "us5ge: ", "<sample:5>", "F20\"20-01-"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:0>", "2147483647", "2147483647", "<1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"}"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=}, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=[1,2], getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:3>", "4", "-2574 ", "-574.5", "<sample:6>", "-2147483648", "-67108863", "-|", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "-1073741824", "x1F"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"[1+2<"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "W57", "<sample:10>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=[1+2<, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", new String[]{"java.lang.String"}, new String[]{"[1,2"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<null>", "2147483647", "/x123456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=[1,2, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"T5"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=T5, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"a,b,c", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=3, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-78"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-78, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "16777215", "<sample:5>", "-2147483647", "-102"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "0x122456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"16777206"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-2147483608"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=16777206, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"5", "", "tX-", "<sample:6>", "[0xF", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "-2147483648", "2147483648Hello, Xorld", "1.123456T78{\"a\":1}", "<sample:1>", "true{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483616", "97", "-->"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "T"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=T, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "1027"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1027}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "8", "\t"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"ab ", "1.124456\n8", "<sample:0>", "0F12345689"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderWrappedText", "java.lang.StringBuffer,int,int,java.lang.String", "<sample:1>", "-67108863", "-2147483648", "TITLD"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"x"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=x, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"", "<sample:5>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"268435531"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=268435531}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"Hello World"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "", "<sample:9>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "2147483647", "\010"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-2", "<>b</a>", "-574.5", "<sample:12>", "\t", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "-2147483648", "1V.5", "1.12345778901234567Hello, Xorld1.1234567", "<sample:14>", "-24", "17", "0x1FF", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"-5744"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-5744", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"-574"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-574, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1X.5"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1X.5, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"02:", "123456789012345678901234567890a,b,c ", "<null>", "-|1:10", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<empty>", "-105", "<sample:5>", "49", "37"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "0F12345689"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=0F12345689, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"ITME", "24", "-1073741676"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"36"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:3>", "-2147483648", "<sample:4>", "-1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=36, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "  ! "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=  ! , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{" :  ", "74", "<sample:2>", "+1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "`"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=`, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false), new String[][]{{"thenComparingInt", "java.util.function.ToIntFunction", "7"}, {"compare", "java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"1179638"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1179638}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"12i30:451.5e300", "o10x1234567892020-02-30T25:61:61", "<sample:10>", "42020-02-30T25:61:61"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.25, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false), new String[][]{{"reversed", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$ReverseComparator2", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false), new String[][]{{"thenComparingDouble", "java.util.function.ToDoubleFunction", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"d1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "20"}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=20, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-37"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-37}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "20\"20-01-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=20\"20-01-, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"12:30:p5", "-66060287", "3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-66060284", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{">1.123456789012345671.25", "-74", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "20\"20-01-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=20\"20-01-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-2113404896"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-2113404896, getLeftPadding=1, getLongOptPrefix=1.2, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{"usage: "}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=usage: , getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{" u "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "+i"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", " -1.5", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" u", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=+i, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-1056964597"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-1056964597, getLeftPadding=2147483647, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"74"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=74, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-2147483648, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"=", "<sample:11>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-2359302"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-4, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "2147483647", "THTlLE", "usage: ", "<sample:3>", "34078718", "16777215", "QUH", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:4>", "35", "   ", "<null>", "<sample:6>", "2147483647", "2359302", "l", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"-2147483616"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483616}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "4", "2/\"2-01-", "1.", "<sample:1>", "-130926", "2147483647", "0F12345689", "true"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:4>", "2147483647", "", "", "<sample:2>", "-134217598", "2147483647", "773"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "89"}, {"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=89, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"67698689", "1e10--1", "21474836l8\t", "<sample:2>", "i", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.133456780x1F"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.133456780x1F, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.12345678901134567]"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "]", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.12345678901134567], getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:5>", "-2147483648", "<sample:6>", "262226", "138"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "56", "-"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "nulll"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=nulll, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"\\\\"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\\\\, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<null>", "48", "usage: PT1H", "-0..01.5", "<sample:3>", "78", "2147483647", ">"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptPrefix", ""}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"g.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=g.5, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "\u00e9744+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=\u00e9744+1, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "a,b,c0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=a,b,c0x1F, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:3>", "-75", "[1-", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-1, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=2147483647}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"2113404857", "--", ".61-12345678", "<sample:5>", "\u00e9]", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "TI_LE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=TI_LE, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptPrefix", new String[]{"java.lang.String"}, new String[]{" u 74"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getOptionComparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix= u 74, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "134217732", "1.12234567"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-54"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-54, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.1d2345778901234567Hell, World"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.1d2345778901234567Hell, World, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"[1827", "-33554405", "-1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "\t1E-5", "51174", "<sample:6>", "1n", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-33554406", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"3"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("   ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2147483647", "", "51.", "<sample:2>", "1.1234567890123456line.separator"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"QU1H", "<sample:0>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.5e3e01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.5e3e01, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"line.separator5.", "9<", "<sample:3>", "H.25", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.1/34567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.1/34567, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"0F12345689"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "", "5.", "<sample:1>", "1.5e3e00", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=0F12345689, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "2147483647", "\"a\":1}", "Q1H", "<sample:7>", "1179619", "0", " |", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"TJTLF"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=TJTLF, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=4, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getWidth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "2013265919", "a,b,d", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "60"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=60, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"-57[1,2]", "<null>", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "1.2]", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{">ITLEP", "-43", "-67108767"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108810", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"20\"2-01-01", "-2147483647", "-21"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "1.12345678Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.12345678Hello, World, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-4194377"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-4194377}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"55", "QH", "<sample:4>", "-1-0.0", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "52"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=52, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"-", "-2147483648", "67108918"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "-,"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2080374730", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=-,, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "48", "{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "1."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=1., getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:2>", "201326657", "0xFFFFFFFF"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-268435454"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-268435454}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<null>", "2147483647", "tCue"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "-"}, {"org.apache.commons.cli.HelpFormatter", "renderOptions", "java.lang.StringBuffer,int,org.apache.commons.cli.Options,int,int", "<sample:2>", "2147483647", "<sample:9>", "-16435", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=-, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-134217732"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-134217732, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"\u00e975+1"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e975+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=TITLE, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.1/2345678\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1.1/2345678\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1", "ab <", "<sample:11>", "1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "`r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=`r, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"-574"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-574", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"12:", "<sample:13>", "false"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=1.25, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "2085", "<sample:11>", "33554430", "20"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "35"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=35}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:2>", "92", "<null>", "8388610", "2"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"V1H", "1X..5", "<sample:4>", "1/5d1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=L, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"ar", "1.123456T782020-01-01", "<sample:2>", "a\"--", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", " 1 "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= 1 , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<empty>", "150", "1.1234567", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "1.123456T78741.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=1.123456T78741.5d, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setWidth", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=10}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.T", "1087", "-51"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2147483647, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<null>", "2013265921", "P21H", ">", "<sample:2>", "2147483647", "131064", "c", "false"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-2147483648}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"2147483648", "-16", "-134217663"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "aDb "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134217679", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=aDb , getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-134217718"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-134217718, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:4>", "589825", "1.5f"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=I, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"2020u01-01", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:4>", "-67108863", "-54", "-1X.5123456789012345678901234567890"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLeftPadding", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "-262179"}, {"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,int,java.lang.String", "<sample:3>", "2", "-18", "TIUKD"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262179", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=-262179, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"a.5f", "0x1F", "<sample:12>", "+2\u00e9", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"5."}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=5., getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=-, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"67"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "1.5d5.", "134217732", "-2147483488"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=67, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"Aull"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=Aull, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"\"a\":1}", "=", "<null>", "--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"-2113404896", "Barg", "line-separatoXr", "<sample:4>", "-"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "74", "-134217727", "u"}, false), new String[][]{{"append", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("u-1 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "96", "<sample:14>", "1", "-134217727"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "<sample:0>", "1179651", "134217732"}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", ""}}), new String[][]{{"append", "char[]", "3"}, {"codePointBefore", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"null1e10", "<sample:6>", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "ac", "7l", "<sample:13>", "1.1/2345678\n", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"134218244"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "QV1H", "-", "<sample:3>", "1.12345778901234567Hello, ,orld"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=134218244, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "2147483647", "1.1134567890123456\t", "<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "2113404896"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=2113404896, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"-71"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=-71, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-51", "[", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "-1X.5arg"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=-1X.5arg, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getDescPadding", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"P"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "23"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setDescPadding", new String[]{"int"}, new String[]{"74"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=74, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<empty>", "-33554446", "-2147483648", ",,0"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=6, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "010abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=010abc, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "QF1H"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:0>", "-2147483648", "5--1+1", "t", "<sample:9>", "256", "4194450", "74"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:3>", "35", "1", "^"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", "java.lang.String", "--0x123456689"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--0x123456689, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "-1065", "5.\u00e9", "010", "<sample:1>", "8388622", "-2130182112", "0F12335689"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "\\\\", "<sample:2>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.12345678901234467"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.12345678901234467, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"thenComparingLong", "java.util.function.ToLongFunction", "2"}, {"thenComparing", "java.util.function.Function", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=-4}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<sample:6>", "-2147483616", "2147483647", "-0.1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"134086721", "0", "1.12345678901234567", "<sample:5>", "nultl", "false"}, false, 5, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "Title1.1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator=Title1.1234567, getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "null0x1234567", "-2113404896", "-32730"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "-0."}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=-0., getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "1", "<sample:12>", "134217732", "4194305"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "Hello, Worldtree"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=Hello, Worldtree, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2359302", "-s11", "\t\037", "<sample:9>", "1E-5usage: "}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "1179659"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=1179659}", SearchInputFactory_scaffolding.receiverState());
 }
}
