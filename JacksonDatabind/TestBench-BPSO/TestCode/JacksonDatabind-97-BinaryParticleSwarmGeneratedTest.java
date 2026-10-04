package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "decimalValue", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", "com.fasterxml.jackson.databind.node.POJONode", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:9>", "<sample:6>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asBoolean", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", "com.fasterxml.jackson.databind.node.POJONode", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isNull", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findPath", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "with", "java.lang.String", "1.123%5678901234567"}, {"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "deepCopy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParents", "java.lang.String", "1.52E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"TITLEa,b,,c", "<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asDouble", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", "java.lang.String", "2020-02-30T25:61"}}, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "traverse", "com.fasterxml.jackson.core.ObjectCodec", "<sample:9>"}}, 1), new String[][]{{"isBigInteger", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "has", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String"}, new String[]{"202_-02-30T25:61:61"}, false, 0, null, 1), new String[][]{{"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParents", "java.lang.String", "010"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", new String[]{"com.fasterxml.jackson.databind.node.POJONode"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findPath", new String[]{"java.lang.String"}, new String[]{"[2,2\\"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", "a-b,f"}}, 3), new String[][]{{"isMissingNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asBoolean", ""}}, 1), new String[][]{{"isNumber", "", "6"}, {"binaryValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asBoolean", "boolean", "true"}}, 1), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", new String[]{"com.fasterxml.jackson.databind.node.POJONode"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParents", "java.lang.String,java.util.List", "-0.0", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "floatValue", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", "java.lang.String", "\n"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isValueNode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "size", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asDouble", "double", "-0.0"}, {"com.fasterxml.jackson.databind.node.POJONode", "findValue", "java.lang.String", "12:30:4F4"}}, 3), new String[][]{{"hasNonNull", "java.lang.String", "4"}, {"fieldNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "shortValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isDouble", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", "java.lang.String,java.util.List", "http://example.com/a?b=c", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"java.lang.String"}, new String[]{")I"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValue", "java.lang.String", "(raw vakue '%s')"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{"int"}, new String[]{"62"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{"int"}, new String[]{"20"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isNumber", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "iterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"asInt", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "withArray", "java.lang.String", "11.5f"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValues", "java.lang.String,java.util.List", "1.12345672020-010-01", "<sample:0>"}}, 2), new String[][]{{"decimalValue", "", "5"}, {"hasNonNull", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "textValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "deepCopy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "binaryValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "withArray", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fieldNames", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isShort", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", new String[]{"com.fasterxml.jackson.databind.node.POJONode"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", "long", "-9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:cu>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 2), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "withArray", "java.lang.String", "-0.0PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", new String[]{"java.lang.String"}, new String[]{"123456789012345678902234567890"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValues", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"5.PT1H--1", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "with", "java.lang.String", "|\"a\"::1}"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "decimalValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "asLong", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "withArray", "java.lang.String", "/x1G"}, {"com.fasterxml.jackson.databind.node.POJONode", "findParents", "java.lang.String,java.util.List", "C.", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValue", "java.lang.String", "true1E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "traverse", "com.fasterxml.jackson.core.ObjectCodec", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}, 2), new String[][]{{"isShort", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:9>", "<sample:4>", "<sample:4>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "booleanValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "booleanValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0x1234567892020-02-30TE25:61:61", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", "PT1H--1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "shortValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isShort", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isPojo", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isShort", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "booleanValue", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "getPojo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "binaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "fields", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "withArray", new String[]{"java.lang.String"}, new String[]{"[1,2]0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "doubleValue", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "isInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"java.lang.String"}, new String[]{"\u00e9(raw value\037'%s')"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asBoolean", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "numberType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "isContainerNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"P", "<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", "com.fasterxml.jackson.databind.node.POJONode", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "binaryValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asBoolean", "boolean", "false"}, {"com.fasterxml.jackson.databind.node.POJONode", "shortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "has", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isContainerNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asDouble", "double", "-1.0000000000000002"}, {"com.fasterxml.jackson.databind.node.POJONode", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParent", new String[]{"java.lang.String"}, new String[]{"1.1234567a,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "equals", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.POJONode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValues", new String[]{"java.lang.String"}, new String[]{"+11234567890123456_8901234567890"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{"long"}, new String[]{"4"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "get", new String[]{"int"}, new String[]{"-1073741775"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findPath", "java.lang.String", "1]e300"}, {"com.fasterxml.jackson.databind.node.POJONode", "isBinary", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "has", new String[]{"int"}, new String[]{"33554442"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "get", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.util.Comparator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigDecimal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isPojo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "with", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "shortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "asDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:12>"}, false, 3, new String[][]{}), new String[][]{{"asBoolean", "boolean", "7"}, {"bigIntegerValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "has", "java.lang.String", ".5"}, {"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", "a!b"}}), new String[][]{{"isTextual", "", "4"}, {"booleanValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "booleanValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "get", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "with", "java.lang.String", "ab"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{"int"}, new String[]{"-32768"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", new String[]{"int"}, new String[]{"20"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "getNodeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "get", "java.lang.String", "2020-1-0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("POJO", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isNull", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", "long", "-4611686018427387904"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isContainerNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "longValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isValueNode", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "_at", "com.fasterxml.jackson.core.JsonPointer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "has", new String[]{"java.lang.String"}, new String[]{"1.1234567]901234567"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValues", "java.lang.String", "110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "elements", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "traverse", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "_at", "com.fasterxml.jackson.core.JsonPointer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isBigDecimal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isIntegralNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "get", "java.lang.String", "5,/"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findPath", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isTextual", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fieldNames", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isFloatingPointNumber", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<sample:5>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1334567890123456--1", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isValueNode", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "asLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "has", "java.lang.String", "2020-01-01"}}), new String[][]{{"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"12:30:45<a>b</a>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asInt", ""}}), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "get", new String[]{"int"}, new String[]{"-65536"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "floatValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isContainerNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"int"}, new String[]{"-2130706432"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "fields", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "has", new String[]{"int"}, new String[]{"62"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParent", new String[]{"java.lang.String"}, new String[]{"1.123467H90123456"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isIntegralNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_pojoEquals", new String[]{"com.fasterxml.jackson.databind.node.POJONode"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "decimalValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", "long", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", ".5-0."}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "get", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:61>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "binaryValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "getNodeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String"}, new String[]{"2147483648 "}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "get", new String[]{"java.lang.String"}, new String[]{"{\"a!:1}1E-5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "withArray", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asLong", "long", "-4611686018427387904"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isInt", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fieldNames", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"java.lang.String"}, new String[]{"1.o5e30D0"}, false, 6, new String[][]{}), new String[][]{{"isPojo", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isArray", ""}}), new String[][]{{"getSchema", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isTextual", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "isLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "booleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "deepCopy", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.POJONode", "asLong", ""}}), new String[][]{{"at", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isValueNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValue", new String[]{"java.lang.String"}, new String[]{"\u00e9(raw value '%s')"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValues", "java.lang.String", "1.1234577"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigDecimal", ""}}), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", new String[]{"java.lang.String"}, new String[]{"\n"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"f1e10", "<sample:0>"}, false), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{"TITL"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", new String[]{"int"}, new String[]{"-56"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{"int"}, new String[]{"-10"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isTextual", ""}, {"com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "deepCopy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "get", new String[]{"java.lang.String"}, new String[]{"-1/5"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fieldNames", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:9>", "<sample:6>", "<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isFloat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asInt", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:2>"}, false), new String[][]{{"asToken", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "doubleValue", ""}}), new String[][]{{"getFloatValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isFloatingPointNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isFloat", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{"java.lang.String"}, new String[]{"-0.0\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "get", "java.lang.String", "T23456789012345678902234567890"}, {"com.fasterxml.jackson.databind.node.POJONode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fieldNames", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValues", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{"numl-1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0yFFFFFFFF2020-01-01", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "textValue", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String"}, new String[]{"http://exa]mple.com/a?b=c"}, false), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{",1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", ""}}), new String[][]{{"subList", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBigInteger", ""}}), new String[][]{{"isBigDecimal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "has", "java.lang.String", "15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "traverse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "has", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1231", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "getPojo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValue", new String[]{"java.lang.String"}, new String[]{".1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "floatValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValue", "java.lang.String", "1.1234"}, {"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "elements", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isShort", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asText", "java.lang.String", "ab;c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "getPojo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isBinary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValues", "java.lang.String,java.util.List", "202\r--01-01", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.POJONode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "has", new String[]{"java.lang.String"}, new String[]{"1/25"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "numberType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.5", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isFloat", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "deepCopy", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isTextual", ""}}), new String[][]{{"doubleValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:5>"}, false), new String[][]{{"isObject", "", "5"}, {"asText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "traverse", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "deepCopy", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:9>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isLong", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "decimalValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParents", "java.lang.String", "\u00ea"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{"java.lang.String"}, new String[]{"1a"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isValueNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asDouble", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"2146483648", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "canConvertToLong", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{"long"}, new String[]{"-9223372036846387200"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036846387200", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "elements", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "shortValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "booleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isFloatingPointNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isIntegralNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}), new String[][]{{"at", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asText", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "shortValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{"long"}, new String[]{"-16777214"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16777214", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.util.Comparator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:1>", "<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "size", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "fieldNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "fields", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:pey>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findPath", new String[]{"java.lang.String"}, new String[]{"TILE"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<null>", "<null>", "<sample:6>"}}), new String[][]{{"findParent", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isObject", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isMissingNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParent", new String[]{"java.lang.String"}, new String[]{"7//a/b"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isPojo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParent", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa`a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isBoolean", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", "java.lang.String", "---0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParent", "java.lang.String", "202\r--01-01<a>b</a>"}}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isValueNode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "numberValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "deepCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "isFloat", ""}}), new String[][]{{"isContainerNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{"-2"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "findParent", "java.lang.String", "12:30:44{"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}), new String[][]{{"asToken", "", "5"}, {"asInt", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1:30:45", "<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "decimalValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asLong", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "binaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asInt", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "canConvertToInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"a", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "path", "int", "0"}}), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "hasNonNull", new String[]{"java.lang.String"}, new String[]{"1.12345678901234561.25"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"java.lang.String"}, new String[]{"1.2345678http://example.com/a?b=c"}, false, 1, new String[][]{}), new String[][]{{"asDouble", "double", "1"}, {"findParent", "java.lang.String", "3"}, {"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "b {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-556662102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "getNodeType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("POJO", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "asToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "isValueNode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "equals", new String[]{"java.util.Comparator", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:4>", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "binaryValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "findParents", new String[]{"java.lang.String"}, new String[]{"\n\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "asText", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "path", new String[]{"java.lang.String"}, new String[]{"(raw walue '%s')"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "c {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-212098743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.POJONode", "com.fasterxml.jackson.databind.node.POJONode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.POJONode", "bigIntegerValue", ""}}), new String[][]{{"hasNonNull", "java.lang.String", "1"}, {"asText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "true {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-1048448770", SearchInputFactory_scaffolding.receiverState());
 }
}
