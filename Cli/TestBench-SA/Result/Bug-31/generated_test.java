package generated.algorithm;

import junit.framework.TestCase;

public class SimulatedAnnealingGeneratedTest extends TestCase {
 public void testGeneratedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"59", "--", "Title", "<sample:2>", " *"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "1", "[", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "getArgName", ""}, {"org.apache.commons.cli.Option", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"2", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "22"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "1.25", "", "<sample:7>", "", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=22}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArg", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{"int"}, new String[]{"74"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\037>"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "setValueSeparator", "char", ">"}, {"org.apache.commons.cli.Option", "getValuesList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=>, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#285#-2134457965", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasOptionalArgs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArg", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{"char"}, new String[]{"a"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "clearValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withValueSeparator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "5", "<sample:0>", "-3", "12"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:0>", "1", "<null>", "1.1234567890123456", "<sample:2>", "59", "-2", "[", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "hasArgs", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{"int"}, new String[]{"77"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "setType", "java.lang.Object", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: 1.5 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasA...#293#196884280", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withArgName", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "59"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<null>", "-3", " | ", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=59, getLeftPadding=1, getLongOptPrefix=a, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withLongOpt", new String[]{"java.lang.String"}, new String[]{"  ]"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"0\037]", "22X", "<sample:4>", "Fs", "true"}, false, 12, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<sample:2>"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "20"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[123456789012345678901234567890", "1.12345678901234567", "<sample:1>", "12:30:45"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=20}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "59", "\n", "1.1234567", "<sample:6>", "5", "262221", "1.12345678901234567"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "withDescription", new String[]{"java.lang.String"}, new String[]{"1.12356789012345671e10"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"1.1234567-", "o", "<sample:4>", "0xFFFFFFFF", "true"}, false, 13, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "-j"}, {"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", ".1235D8W11d3\t567 [[ARH]1e00"}, {"org.apache.commons.cli.HelpFormatter", "setLeftPadding", "int", "262221"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=262221, getLongOptPrefix=--, getLongOptSeparator=-j, getNewLine=\n, getOptPrefix=.1235D8W11d3\t567 [[ARH]1e00, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "addValueForProcessing", new String[]{"java.lang.String"}, new String[]{" ]"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 public void testGeneratedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderWrappedText", new String[]{"java.lang.StringBuffer", "int", "int", "java.lang.String"}, new String[]{"<sample:1>", "12", "0", "0.123568911d3\n567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0.123568911d3\n567 {length=17}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"", "3 E11m06[08796\no...121t:78[98012lU99> :: ", "<null>", "tue", "false"}, false, 8, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "0.123568911d3\t567", "1.02C4667-1.1224567", "<sample:4>", "k", "true"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "123456789012345678901234567890", "<sample:3>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String", "<sample:6>", "2", "N pt", "o| 1-55e301\037| ", "<sample:6>", "-2147483595", "-2147483647", " [ARG]must specify longopt"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Option", "getType", ""}, {"org.apache.commons.cli.Option", "addValueForProcessing", "java.lang.String", "-05"}, {"org.apache.commons.cli.Option", "addValueForProcessing", "java.lang.String", "1Gs25 [ARG]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=-05, getValueSeparator=\000, getValues=[-05], hasArg=true, hasArgName=false, hasArgs=f...#288#-787569732", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setNewLine", new String[]{"java.lang.String"}, new String[]{"1s2l @Ri"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-1", "0.123568911d3\n567", "   ", "<sample:2>", "F", "true"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1s2l @Ri, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"012356891S3\n567abc", "<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", ""}, {"org.apache.commons.cli.HelpFormatter", "setArgName", "java.lang.String", ".12356789012345671e10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=.12356789012345671e10, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "requiresArg", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "setOptionalArg", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#285#892775575", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{",202010-011.12345678901234567", "<sample:18>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "2020-2-30T2:61s61", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:0>", "0", "73"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "2", "C1", "usage: ", "<sample:5>", "T1X ", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{",202010-011.12345678901224567", "<sample:18>", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "2020-2-30T2:61s61", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "printOptions", "java.io.PrintWriter,int,org.apache.commons.cli.Options,int,int", "<empty>", "2147483647", "<sample:0>", "0", "73"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "2", "C1", "usage: ", "<sample:5>", "T1X ", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "addValue", "java.lang.String", "1.1234567890123456"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=false, ...#282#1187035175", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Option", "setOptionalArg", "boolean", "true"}, {"org.apache.commons.cli.Option", "acceptsArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#290#1091848785", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getDescription", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.cli.Option", "setDescription", "java.lang.String", "\":: "}, {"org.apache.commons.cli.Option", "hashCode", ""}, {"org.apache.commons.cli.Option", "getValue", "java.lang.String", " D[ARG]"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\":: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: \"::  ] {getArgName=null, getArgs=-1, getDescription=\":: , getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#1953662150", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", ">"}, {"org.apache.commons.cli.Option", "addValueForProcessing", "java.lang.String", "1.5"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=1.5, getValueSeparator=>, getValues=!ArrayStoreExcept...#332#-616512798", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:1>", "73", "]", " ", "<sample:18>", "-2", "-2147483648", "Hellp, World-1", "false"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "1Gs25 [ARG]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=1Gs25 [ARG], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"5", "QW8Sb[1.52GTp0-02--30T25\r6:;61.5-.0", "74", "<null>", "", "false"}, false, 4, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.io.PrintWriter,int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,int,int,java.lang.String,boolean", "<sample:3>", "2", "1.12345678901234567", "1E-5", "<sample:1>", "75", "74", "\n", "false"}, {"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "0/12356891159d3\n5671234567890012345668901234667890-", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"32", "QW8Sb[1.52Tp0-03--30T25\r7:;61.5-.0", "62|", "<sample:0>", "a>`", "true"}, false, 10, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptionComparator", "java.util.Comparator", "<null>"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "0/12356891159d3\n5671234567890012345668901234667890-", "<sample:4>", "true"}, {"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgs", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "setArgName", "java.lang.String", " [ARG]"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  [ARG...] :: 0 ] {getArgName= [ARG], getArgs=10, getDescription=0, getId=97, getLongOpt=, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=true, hasArg...#289#-1204290389", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "73", "<sample:2>", "74", "-2147483648"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "73", "<sample:2>", "74", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "75", "1", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-1073741800"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "   "}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "4", "1L", "<", "<null>", "2", "75", "a"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-2147483648"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "1.1235678901234567", "h h", "<sample:4>", " |  |\037", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=2, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"10", "1.1235678901234567", "h h", "<sample:3>", " |  |\037", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2147483647", "-2", "1.25", "<null>", " ]"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=2, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "1.1235678901334567", "h h", "<sample:4>", " |  |", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2147483647", "-2", "1.25", "<null>", " ]"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "2"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=10, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=2, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-2147483648", "1.1235678901334567", "h h", "<sample:4>", " |  |", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2147483647", "-2", "1.25", "<null>", " ]"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "2"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "1.1235678901334567Title", "h h", "<sample:4>", " |  |", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2147483647", "-2", "1.25", "<null>", " ]"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "2"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "-4"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "1.1235678901334567Title", "h h", "<sample:4>", " |  |", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2147483647", "-2", "1.25", "<null>", " ]"}, {"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=10, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "1.1235678901334567Title", "]", "<sample:4>", "1L", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "2147483647", "-2", "1.25", "<null>", " ]"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{"boolean"}, new String[]{"false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<empty>", "5", "  ", "true", "<sample:6>", "-1", "2147483647", "-2", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ option: ", ".5", "<sample:6>", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<empty>", "5", " ", "true", "<sample:6>", "-1", "-2147483648", "-2", "false"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ option: ", ".5", "<sample:6>", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "118"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<empty>", "-1048520", " ", "true", "<sample:6>", "1", "-2147483648", "-", "false"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ option: ", ".5", "<sample:7>", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "118"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "-1048478", ".", "true", "<sample:6>", "1", "-2147483648", "F", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "2147483647"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "Hello, World"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "-1048478", "\n", "truf", "<sample:5>", "1", "-2147483648", "F", "false"}, false, 14, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "-2147483648"}, {"org.apache.commons.cli.HelpFormatter", "setLongOptSeparator", "java.lang.String", "Helloo, World"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getValues", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "getValue", ""}}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0 sample  :: a :: true ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=f...#302#-563013514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Option", "getValue", ""}}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:  a  :: sample :: true ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=a, getOpt=, getValue=null, getValueSeparator=\000, getValues=null...#330#590532057", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:  a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=a, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg...#322#-428811289", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Option", "getValue", ""}}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0  [ARG] ::  :: true ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, h...#296#978645142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   :: a :: true ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=...#322#42073521", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  :: sample :: true ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=...#304#1742204880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#-1691173374", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: sample  ::  :: true ] {getArgName=null, getArgs=-1, getDescription=, getId=115, getLongOpt=null, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=f...#303#1322984381", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: sample  ::  ] {getArgName=null, getArgs=-1, getDescription=, getId=115, getLongOpt=null, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#295#2101997295", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   [ARG] :: 0 :: true ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, ha...#326#928230629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a 0  [ARG] ::  :: true ] {getArgName=null, getArgs=1, getDescription=, getId=97, getLongOpt=0, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, ha...#294#1528081164", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: a 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=97, getLongOpt=0, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=fa...#286#-1407361986", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0  :: sample :: true ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=...#304#-427652456", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: 0  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1937799626", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1), new String[][]{{"setType", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: sample  :: a :: true ] {getArgName=null, getArgs=-1, getDescription=a, getId=115, getLongOpt=null, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName...#305#-866831615", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=115, getLongOpt=null, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ...#297#-344610545", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 32, new String[][]{}, 2), new String[][]{{"setType", "java.lang.Object", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasAr...#292#-647092164", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 33, new String[][]{}, 2), new String[][]{{"setType", "java.lang.Object", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1937799626", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}, 2), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=a, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg...#322#-428811289", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}, 2), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}, 3), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}, 3), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}, 3), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1937799626", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "getValues", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 3), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.cli.Option", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  123456789012345678901234567890  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=123456789012345678901234567890, getOpt=, ...#380#-1937161081", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.cli.Option", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a 123456789012345678901234567890  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=123456789012345678901234567890, getOpt=a, getValue=null, getValueSeparator=\000, ge...#342#-1977080100", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.cli.Option", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 123456789012345678901234567890  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=123456789012345678901234567890, getOpt=0, getValue=null, getValueSeparator=\000,...#344#-663549904", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.cli.Option", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample 123456789012345678901234567890  [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=123456789012345678901234567890, getOpt=sample, getValue=null, getValu...#357#-1212676517", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12n456789012345678901234567890"}, {"org.apache.commons.cli.Option", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample 12n456789012345678901234567890  [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=12n456789012345678901234567890, getOpt=sample, getValue=null, getValu...#357#862624741", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.cli.Option", "setDescription", "java.lang.String", "-1"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12n456789012345678901234567890"}, {"org.apache.commons.cli.Option", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  12n456789012345678901234567890  :: -1 ] {getArgName=null, getArgs=-1, getDescription=-1, getId=!StringIndexOutOfBoundsException, getLongOpt=12n456789012345678901234567890, getOpt=, getValue...#372#1603787121", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1937799626", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=a, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg...#322#-428811289", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Option", "getKey", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "acceptsArg", ""}, {"org.apache.commons.cli.Option", "addValue", "java.lang.String", " *"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "acceptsArg", ""}, {"org.apache.commons.cli.Option", "addValue", "java.lang.String", " *"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#285#892775575", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"true"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#313#18067074", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"false"}, false, 16, new String[][]{{"org.apache.commons.cli.Option", "getValuesList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#-1691173374", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "2", "arg", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:320>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: 320 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasA...#293#9817055", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:-320>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: -320 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, has...#294#1167550154", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:-320>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 :: -320 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, ha...#326#-964975685", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:-261>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 :: -261 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, ha...#326#-1243630473", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:-241>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 :: -241 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, ha...#326#2044267065", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12:30::45NO_ARGS_ALLOWED"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0 12:30::45NO_ARGS_ALLOWED  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=12:30::45NO_ARGS_ALLOWED, getOpt=0, getValue=null, getValueSeparator=\000, getValues=n...#332#-512416336", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", ">"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12:30::45NO_ARGS_ALLOWED"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0 12:30::45NO_ARGS_ALLOWED  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=12:30::45NO_ARGS_ALLOWED, getOpt=0, getValue=null, getValueSeparator=>, getValues=n...#331#-1319021167", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", ">"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12:30::45NO_ARGS_ALLOWED"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: sample 12:30::45NO_ARGS_ALLOWED  [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=12:30::45NO_ARGS_ALLOWED, getOpt=sample, getValue=null, getValueSeparator=>...#344#-36049394", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", ">"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12:30::45NO_ARGS_ALLOWED"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:  12:30::45NO_ARGS_ALLOWED  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=12:30::45NO_ARGS_ALLOWED, getOpt=, getValue=null, getValu...#357#1524051914", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", ">"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12:30::45NO_ARGS_ALLOWED"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: \000 12:30::45NO_ARGS_ALLOWED  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=12:30::45NO_ARGS_ALLOWED, getOpt=\000, getValue=null, getValueSeparator=>, getValues...#334#-2018432369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setDescription", new String[]{"java.lang.String"}, new String[]{"usageA:8 "}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: usageA:8  ] {getArgName=null, getArgs=-1, getDescription=usageA:8 , getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=fa...#302#-28165970", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setDescription", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: i ] {getArgName=null, getArgs=-1, getDescription=i, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#-771612786", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setDescription", new String[]{"java.lang.String"}, new String[]{"i"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   :: i ] {getArgName=null, getArgs=-1, getDescription=i, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#-1905050397", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "java.lang.String"}, new String[]{"<sample:3>", "0", "2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getArgName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "-1073741824", "1TITLE", "nuulm", "<sample:6>", "1073741823", "-2147483648", "ac", "true"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printOptions", new String[]{"java.io.PrintWriter", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:0>", "73", "<sample:2>", "74", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("   ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("      ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "rtrim", "java.lang.String", "   "}, {"org.apache.commons.cli.HelpFormatter", "getLongOptSeparator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=1L, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"010"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "-40"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=010, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"011"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=011, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"/10"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=/10, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", new String[]{"java.lang.String"}, new String[]{"/.0"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "createPadding", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=/.0, getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"2", "--", "Title", "<sample:2>", " ]"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "1", "[", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printWrapped", new String[]{"java.io.PrintWriter", "int", "int", "java.lang.String"}, new String[]{"<empty>", "10", "-3", "--"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"59", "--", "Title", "<sample:2>", " *"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "1", "", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", " [ARG]"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= [ARG], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"59", "--", "Title", "<sample:2>", " *"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "1", "", "<sample:5>"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", " [ARG]"}, {"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= [ARG], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setOptionComparator", new String[]{"java.util.Comparator"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"59", "--", "Title", "<sample:2>", " *"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "22", "", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", " [ARG]"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= [ARG], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"59", ",-", "Title", "<sample:2>", " *"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "22", "", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", " [0RG]"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix= [0RG], getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"77", "1.1235678901234567", "i", "<sample:3>", " *"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "1E-5", "<sample:1>"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "22", "", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String"}, new String[]{"262221", "1.12356789012345671e10", "h", "<sample:4>", "1.1234567"}, false, 11, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options", "1E-", "<sample:1>"}, {"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:0>", "22", "", "<sample:4>"}, {"org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"59", "-0.0", "1.12356789012345671e10", "<sample:6>", "   ", "false"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=3, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "-0.0", ".12356789012345671e10", "<sample:5>", "   ", "false"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "-0.0", ".12356789012345671e10", "<sample:4>", "   ", "true"}, false, 3, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "3"}, {"org.apache.commons.cli.HelpFormatter", "findWrapPos", "java.lang.String,int,int", "-2", "75", "0"}, {"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=3, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "must specify longopt", "hh", "<null>", " |  | ", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "3"}, {"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"118", "mvst specify longopt", "h h", "<sample:4>", " |  |\037", "true"}, false, 2, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "2"}, {"org.apache.commons.cli.HelpFormatter", "getLeftPadding", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=2, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLeftPadding", new String[]{"int"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=2, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgs", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=0, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fals...#285#339708126", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getDescription", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getDescription", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getDescription", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getDescription", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "isRequired", ""}, {"org.apache.commons.cli.Option", "hasValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "10", " | ", "true", "<sample:6>", "-1", "3", "-2", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printWrapped", "java.io.PrintWriter,int,java.lang.String", "<sample:0>", "2", "2020-02-30T25:61:61"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", " ]", ".5", "<null>", "]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "isRequired", new String[]{"boolean"}, new String[]{"true"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.OptionBuilder", actual.getClass().getName());
 }
 public void testGeneratedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "10", " ", "true", "<sample:6>", "-1", "2147483647", "-2", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "  ]", ".5", "<sample:6>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "10", " ", "true", "<sample:6>", "-1", "2147483647", "-2", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "  ]", ".5", "<sample:6>", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "5", " ", "true", "<sample:6>", "-1", "2147483647", "-2", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "  ]", ".5", "<sample:6>", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<null>", "5", " ", "true", "<sample:6>", "-1", "2147483647", "-2", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "  ]", ".5", "<sample:6>", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "int", "int", "java.lang.String", "boolean"}, new String[]{"<empty>", "-5", "  ", "true", "<sample:6>", "-1", "2147483647", "-2", "true"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "TITLE"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "  ]", ".5", "<sample:6>", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,org.apache.commons.cli.Options,boolean", "must specify longopt", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArg", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Option", "getArgName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getOpt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "getValue", ""}, {"org.apache.commons.cli.Option", "hasValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "hasValueSeparator", ""}, {"org.apache.commons.cli.Option", "setValueSeparator", "char", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=0, getValues=null, hasArg=false, hasArgName=false, ha...#293#1380129835", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "rtrim", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "59"}, {"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=1.12345678, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=59}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "getArgName", ""}, {"org.apache.commons.cli.Option", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "getArgName", ""}, {"org.apache.commons.cli.Option", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"010", "<sample:0>", "true"}, false, 6, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "77"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=77}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"77"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("                                                                             ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.Option", actual.getClass().getName());
  assertEquals("[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.cli.Option", "getLongOpt", ""}}), new String[][]{{"setType", "java.lang.Object", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasAr...#292#-647092164", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 31, new String[][]{}), new String[][]{{"setType", "java.lang.Object", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 33, new String[][]{}), new String[][]{{"setType", "java.lang.Object", "7"}, {"getArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1937799626", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "getDescription", ""}}), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Option", "setType", "java.lang.Object", "<i:1>"}, {"org.apache.commons.cli.Option", "getDescription", ""}}), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null :: 1 ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1006886801", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Option", "setType", "java.lang.Object", "<i:1>"}, {"org.apache.commons.cli.Option", "getDescription", ""}}), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"hasArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 :: 1 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasAr...#323#555565804", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"clone", "", "7"}, {"getArgs", "", "7"}, {"getValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option:  a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=a, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg...#322#-428811289", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "addValueForProcessing", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "hasArgName", ""}, {"org.apache.commons.cli.Option", "addValueForProcessing", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 public void testGeneratedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "addValueForProcessing", new String[]{"java.lang.String"}, new String[]{"Hellp, World-1"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "hasArgName", ""}, {"org.apache.commons.cli.Option", "addValueForProcessing", "java.lang.String", ""}, {"org.apache.commons.cli.Option", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 public void testGeneratedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "findWrapPos", new String[]{"java.lang.String", "int", "int"}, new String[]{"h", "4", "2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValues", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValues", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValues", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValues", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ARG...]", "0x1F", "<sample:6>", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=I, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ARG...]", "20x1F", "<sample:6>", "O.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{".12356789012345671e10"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ARG...]", "20x1F", "<sample:6>", "O.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=.12356789012345671e10, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{".12356789012345671e10arg"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getDescPadding", ""}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String", "[ARG...]", "20x1F", "<sample:6>", "O.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=.12356789012345671e10arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setRequired", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "hasLongOpt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a --1  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=--1, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=...#288#1344337222", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000 --1  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=--1, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, has...#293#-855030164", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  --1  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=--1, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false...#316#2145542619", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a --1  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=--1, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false...#298#-595540198", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getLongOptPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.OptionBuilder", "org.apache.commons.cli.OptionBuilder", "create", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setOptPrefix", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=1.5f, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setNewLine", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=3, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setArgName", new String[]{"java.lang.String"}, new String[]{"]"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "int,java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "-1", "1.5f", "0x1F", "<sample:5>", "1E-", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=], getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasArgName", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.apache.commons.cli.Option", "addValueForProcessing", "java.lang.String", "1.1234567890123456"}, {"org.apache.commons.cli.Option", "getValue", "int", "-1"}, {"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", "12n4567890123456789012344678>90"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  12n4567890123456789012344678>90  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=12n4567890123456789012344678>90, getOpt=...#382#-1372077209", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getKey", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "setLongOptPrefix", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=1.12345678, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "acceptsArg", ""}, {"org.apache.commons.cli.Option", "addValue", "java.lang.String", " *"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#285#892775575", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "acceptsArg", ""}, {"org.apache.commons.cli.Option", "addValue", "java.lang.String", " *"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "createPadding", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("          ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setOptionalArg", new String[]{"boolean"}, new String[]{"true"}, false, 16, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}, {"org.apache.commons.cli.Option", "getValuesList", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#295#1204698755", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-2147483648", "3", "12:30:45", "<sample:0>", "TITLE", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "h", "2020-02-30T25:61:61", "<sample:1>", "arg", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"int", "java.lang.String", "java.lang.String", "org.apache.commons.cli.Options", "java.lang.String", "boolean"}, new String[]{"-2147483648", "", "12:330:45", "<sample:0>", "F", "true"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setSyntaxPrefix", "java.lang.String", "h hh"}, {"org.apache.commons.cli.HelpFormatter", "setWidth", "int", "12"}, {"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "h", "2020-2-30T2:61:61", "<sample:1>", "arg", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 public void testGeneratedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getOptionComparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printUsage", "java.io.PrintWriter,int,java.lang.String,org.apache.commons.cli.Options", "<sample:1>", "2", "arg", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.cli.HelpFormatter$OptionComparator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#906244096", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:-1024>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: -1024 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#295#-984625630", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:1024>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: 1024 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, has...#294#1780353965", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:256>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: 256 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasA...#293#1580803709", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:315>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 :: 315 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasA...#293#1352667577", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "acceptsArg", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "acceptsArg", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgs", new String[]{"int"}, new String[]{"59"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "equals", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a [ARG...] :: 0 ] {getArgName=null, getArgs=59, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasA...#292#1657174634", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printHelp", new String[]{"java.lang.String", "org.apache.commons.cli.Options", "boolean"}, new String[]{"2", "<sample:2>", "false"}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "printHelp", "java.lang.String,java.lang.String,org.apache.commons.cli.Options,java.lang.String,boolean", "1.25", "", "<sample:7>", "", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setDescription", new String[]{"java.lang.String"}, new String[]{"usage: "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: usage:  ] {getArgName=null, getArgs=-1, getDescription=usage: , getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false,...#298#7604750", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setDescription", new String[]{"java.lang.String"}, new String[]{"usageA:8 "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: usageA:8  ] {getArgName=null, getArgs=-1, getDescription=usageA:8 , getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=fa...#302#-28165970", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasOptionalArg", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "hasOptionalArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasOptionalArg", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasOptionalArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasOptionalArg", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "hasOptionalArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasOptionalArg", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "hasOptionalArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasOptionalArg", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "hasOptionalArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getOpt", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "77", "1.25", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "printUsage", new String[]{"java.io.PrintWriter", "int", "java.lang.String", "org.apache.commons.cli.Options"}, new String[]{"<sample:0>", "-2147483648", "1.35e", "<sample:13>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getArgName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arg", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ option: a  :: 0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ option: 0  [ARG] ::  ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[ option: sample   [ARG] :: 0 ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.HelpFormatter", "setDescPadding", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=10, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getId", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getId", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("115", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getId", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "isRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 public void testGeneratedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{"int"}, new String[]{"118"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{"int"}, new String[]{"-118"}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValue", new String[]{"int"}, new String[]{"-118"}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArg", ""}, {"org.apache.commons.cli.Option", "setRequired", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#287#608740577", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValueSeparator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValueSeparator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValueSeparator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValueSeparator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:3>", "118", "<null>", "262221", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 public void testGeneratedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "<null>", "262221", "0"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "<null>", "262215", "0"}, false, 1, new String[][]{{"org.apache.commons.cli.HelpFormatter", "getNewLine", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 public void testGeneratedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:6>", "-2147483617", "<sample:5>", "262215", "28"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "renderOptions", new String[]{"java.lang.StringBuffer", "int", "org.apache.commons.cli.Options", "int", "int"}, new String[]{"<sample:7>", "-2147483617", "<sample:5>", "262181", "28"}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}, {"org.apache.commons.cli.Option", "setOptionalArg", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  :: 1 ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasA...#293#-2048005995", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:12>"}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}, {"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "setOptionalArg", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  :: 12 ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, has...#294#-1589960215", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:12>"}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}, {"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "setOptionalArg", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  :: 12 ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, has...#293#1623605692", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setType", new String[]{"java.lang.Object"}, new String[]{"<i:-45>"}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "hasArgs", ""}, {"org.apache.commons.cli.Option", "hasLongOpt", ""}, {"org.apache.commons.cli.Option", "setOptionalArg", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  :: -45 ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, ha...#294#-1572848013", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=], getValues=null, hasArg=false, h...#313#1153477085", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=], getValues=null, hasArg=false, hasArgName=false, hasArg...#290#-2067708500", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=], getValues=null, hasArg=false, hasArgName=false, ha...#293#1673374622", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=], getValues=null, hasArg=tru...#317#-143772465", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hasValueSeparator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", "p"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=p, getValues=null, hasArg=false, hasArgName=false, hasArg...#290#-901884161", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getArgs", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}, {"org.apache.commons.cli.Option", "getValueSeparator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "getValuesList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "getKey", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3007", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1488", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=null, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=f...#288#1274325448", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1864843158", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: sample   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=115, getLongOpt=, getOpt=sample, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false,...#297#228801913", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, h...#314#177950179", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: \000  :: null ] {getArgName=null, getArgs=-1, getDescription=null, getId=0, getLongOpt=null, getOpt=\000, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArg...#291#-894555148", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909673606", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0 sample  :: a ] {getArgName=null, getArgs=-1, getDescription=a, getId=48, getLongOpt=sample, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, ha...#294#90669480", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", "getSyntaxPrefix", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("usage: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getArgName=arg, getDescPadding=3, getLeftPadding=1, getLongOptPrefix=--, getLongOptSeparator= , getNewLine=\n, getOptPrefix=-, getSyntaxPrefix=usage: , getWidth=74}", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:   [ARG] :: 0 ] {getArgName=null, getArgs=1, getDescription=0, getId=!StringIndexOutOfBoundsException, getLongOpt=null, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg=tru...#318#-406315369", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1488", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: 0  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#1937799626", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option:  a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=!StringIndexOutOfBoundsException, getLongOpt=a, getOpt=, getValue=null, getValueSeparator=\000, getValues=null, hasArg...#322#-428811289", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.cli.Option", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3007", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: sample ] {getArgName=null, getArgs=-1, getDescription=sample, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, h...#296#-1691173374", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#286#1524109934", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "setValueSeparator", "char", "-"}, {"org.apache.commons.cli.Option", "getValuesList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=-, getValues=null, hasArg=false, hasArgName=false, hasArgs=fal...#285#-1369156670", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.cli.Option", "setLongOpt", "java.lang.String", ">"}, {"org.apache.commons.cli.Option", "setValueSeparator", "char", "-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ option: a >  :: 0 ] {getArgName=null, getArgs=-1, getDescription=0, getId=97, getLongOpt=>, getOpt=a, getValue=null, getValueSeparator=-, getValues=null, hasArg=false, hasArgName=false, hasArgs=fals...#283#284149072", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgName", new String[]{"java.lang.String"}, new String[]{"."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=., getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=false, ...#282#2044816876", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgName", new String[]{"java.lang.String"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=0, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=true, hasArgs=false, ...#282#-704066518", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgName", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: a  :: 0 ] {getArgName=, getArgs=-1, getDescription=0, getId=97, getLongOpt=null, getOpt=a, getValue=null, getValueSeparator=\000, getValues=null, hasArg=false, hasArgName=false, hasArgs=false, ...#282#1187035175", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgName", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=false, hasArgs=false...#284#632143663", SearchInputFactory_scaffolding.receiverState());
 }
 public void testGeneratedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", "setArgName", new String[]{"java.lang.String"}, new String[]{";"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[ option: 0  [ARG] ::  ] {getArgName=;, getArgs=1, getDescription=, getId=48, getLongOpt=null, getOpt=0, getValue=null, getValueSeparator=\000, getValues=null, hasArg=true, hasArgName=true, hasArgs=false...#284#1595622923", SearchInputFactory_scaffolding.receiverState());
 }
}
