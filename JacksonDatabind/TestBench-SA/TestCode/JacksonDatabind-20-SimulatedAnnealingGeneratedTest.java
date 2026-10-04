package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "iterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "-1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d\":9223372036854775807,\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1297143338", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d\":9223372036854775807,\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1297143338", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"123456789012345678901234567890", "1.0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"123456789012345678901234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-541047228", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-541047228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"<a>b</a>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"<a>b</a>\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#308252264", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"<a>b</a>\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#308252264", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Long", "-1", "-4611686018427387904"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.0", "<sample:0>"}}), new String[][]{{"has", "java.lang.String", "7"}, {"add", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[true] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, i...#314#1546467589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"-1\":-4611686018427387904,\".09.0\":a} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#1959701708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "without", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "at", "java.lang.String", "a,b,c"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", "2020-01-01"}}), new String[][]{{"fieldNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isMissingNode", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.util.Collection", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "path", "java.lang.String", "{\"aW1}"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"\tM{1.5", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"\\tM{1.5\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-2064376035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"}", "<null>"}, false), new String[][]{{"asLong", "", "7"}, {"findPath", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"}\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#-1507658670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "short"}, new String[]{"0xFFFFFFFF", "32767"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"0xFFFFFFFF\":32767} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#-260414283", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"0xFFFFFFFF\":32767} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#-260414283", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"[1-2]", "1.7976931348623157E308"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_childrenEqual", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"[1-2]\":1.7976931348623157E308} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#-1786787132", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"[1-2]\":1.7976931348623157E308} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#-1786787132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"\r\"aW1}", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "-0.0", "-32768"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", ""}}), new String[][]{{"findParents", "java.lang.String,java.util.List", "4"}, {"containsAll", "java.util.Collection", "4"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"_\"pXHelmo, Worlda b", "-Infinity"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "-0./", "-16309"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "\tM{1.5", "0"}}, 1), new String[][]{{"findParents", "java.lang.String,java.util.List", "4"}, {"iterator", "", "5"}, {"hasNext", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"-0./\":-16309,\"\":[],\"\\tM{1.5\":0,\"_\\\"pXHelmo, Worlda b\":-Infinity} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=f...#376#548937666", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,boolean", "-1", "true"}}), new String[][]{{"asBoolean", "", "4"}, {"asToken", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"X", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"X\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#-875417001", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"X\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#-875417001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "", "<null>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParent", "java.lang.String", "00"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,byte[]", "{", "<sample:3>"}}, 3), new String[][]{{"hasNonNull", "int", "1"}, {"asDouble", "double", "2"}, {"findValue", "java.lang.String", "7"}, {"findPath", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":true,\"{\":\"Ag==\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#-598484099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "true"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "\0371.1234567", "<sample:7>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParent", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,byte[]", "1.25", "<null>"}}, 2), new String[][]{{"get", "int", "1"}, {"asDouble", "double", "1"}, {"asBoolean", "", "7"}, {"findPath", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\\u001F1.1234567\":-1,\"1.25\":null,\"\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, i...#352#556944376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "<null>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "[1++f22][u,[E", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<empty>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParent", "java.lang.String", "1E-5"}}, 2), new String[][]{{"asInt", "int", "6"}, {"deepCopy", "", "0"}, {"isFloat", "", "2"}, {"findValues", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"[1++f22][u,[E\":{},\"\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#-892639216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Float"}, new String[]{"3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "}10", "3.4028235E38"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", " ", "-27"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "path", "int", "-16777214"}}, 1), new String[][]{{"at", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.FloatNode", actual.getClass().getName());
  assertEquals("3.4028235E38 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble...#321#6481202", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"}10\":3.4028235E38,\" \":-27} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#1665061559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "{\"aW1}", "-32768"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<null>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{\\\"aW1}\":-32768} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#-679632602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isInt", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putObject", "java.lang.String", "{ a!\u00e8"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.lang.String", "{"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{ a!\u00e8\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#1825288689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1e10", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1e10\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-1184444882", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1e10\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-1184444882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5e300\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1645399159", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5e300\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1645399159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "set", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1E-5", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:5>"}}), new String[][]{{"doubleValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1E-5\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#19631973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"", "-8.988465674311579E307"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isFloat", ""}}), new String[][]{{"findParent", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\":-8.988465674311579E307} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#-1352377831", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":-8.988465674311579E307} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#-1352377831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"", "NaN"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Float", "1-12345678", "-3.4028235E38"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", ""}}), new String[][]{{"bigIntegerValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1-12345678\":-3.4028235E38,\"\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#-1803084101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1..5f", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1..5f", "60"}}), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1..5f\":60} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1029678118", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1.1234567890123456", "<sample:7>"}}), new String[][]{{"booleanNode", "boolean", "4"}, {"asDouble", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"0y1c2C45678m90xFFFFFFFF ", "1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "1.12345678901A34567"}}, 2), new String[][]{{"has", "java.lang.String", "0"}, {"findValues", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fields", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<null>"}}, 1), new String[][]{{"hasNext", "", "6"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1y.5f", "<sample:14>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "with", "java.lang.String", "<a>b</a>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", ""}}, 1), new String[][]{{"isBinary", "", "4"}, {"findValuesAsText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1y.5f\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#1034656061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"[D1+2", "<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".09.0", "1E+100"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\".09.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-336575325", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".09.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-336575325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".09.0", "1E+100"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "http://example.com/a?b=c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"http://example.com/a?b=c\":2147483647,\".09.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBool...#364#-1501328029", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"http://example.com/a?b=c\":2147483647,\".09.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBool...#364#-1501328029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".09.0", "5E+99"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "http://example.com/a?b=c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"http://example.com/a?b=c\":2147483647,\".09.0\":5E+99} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#149730710", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"http://example.com/a?b=c\":2147483647,\".09.0\":5E+99} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#149730710", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".09.", "1E+100"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "http://example.com/a?b=c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"http://example.com/a?b=c\":2147483647,\".09.\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-1184864617", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"http://example.com/a?b=c\":2147483647,\".09.\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-1184864617", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".79.", "1E+100"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "http://example.com/a?b=c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"http://example.com/a?b=c\":2147483647,\".79.\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-1402994832", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"http://example.com/a?b=c\":2147483647,\".79.\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-1402994832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".79.", "1E+100"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "hstp://example.com/a?b=c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"hstp://example.com/a?b=c\":2147483647,\".79.\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-598579567", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"hstp://example.com/a?b=c\":2147483647,\".79.\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-598579567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".79.", "1E+100"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "hstp://example.com/a?b=c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"http://example.com/a?b=c", "1E+100"}, false, 5, new String[][]{}, 3), new String[][]{{"get", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"http://example.com/a?b=c", "1E+100"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:2>"}}, 3), new String[][]{{"get", "int", "7"}, {"isBoolean", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"1073741807"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "intValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\":\"AH8=\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#1602345620", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:6>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "size", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "12{:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "a b", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "size", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "12{:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"1E+100"}, false, 3, new String[][]{}, 2), new String[][]{{"booleanValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"1E+100"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "traverse", "com.fasterxml.jackson.core.ObjectCodec", "<sample:6>"}}, 2), new String[][]{{"booleanValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"-0.00285"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "traverse", "com.fasterxml.jackson.core.ObjectCodec", "<sample:6>"}}, 2), new String[][]{{"booleanValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d\":9223372036854775807,\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1297143338", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d\":9223372036854775807,\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1297143338", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d4", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d4\":9223372036854775807,\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isC...#350#-1801329092", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d4\":9223372036854775807,\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isC...#350#-1801329092", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d4", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "\u00e9"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d4\":9223372036854775807,\"\u00e9\":[],\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fal...#357#-164477513", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d4\":9223372036854775807,\"\u00e9\":[],\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fal...#357#-164477513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "\u00e9"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d4\":9223231299366420479,\"\u00e9\":[],\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fal...#357#553854334", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d4\":9223231299366420479,\"\u00e9\":[],\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fal...#357#553854334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "\u00e9"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d4\":9223231299366420479,\"\u00e9\":[],\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoo...#365#-1779930461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d4\":9223231299366420479,\"\u00e9\":[],\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoo...#365#-1779930461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.6d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#-2050354535", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#-2050354535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1,..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.6d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1,..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=f...#359#-1317006945", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1,..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=f...#359#-1317006945", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1..5e"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.6d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1..5e\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#-1965545064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1..5e\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#-1965545064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5e"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.6d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.6d4\":9223231299366420479,\"\":\"1..5e\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isC...#350#-1786955149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.6d4\":9223231299366420479,\"\":\"1..5e\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isC...#350#-1786955149", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.6d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.6d4\":9223231299366420479,\"\":\"1..5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1114046556", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.6d4\":9223231299366420479,\"\":\"1..5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1114046556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\":\"0xFFFFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-476184528", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":\"0xFFFFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-476184528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"+--r1", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", "{\"a\"1}"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_at", "com.fasterxml.jackson.core.JsonPointer", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "path", "int", "4194314"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isValueNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValue", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "nullNode", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String", "m\tull"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}}, 2), new String[][]{{"intValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "nullNode", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String", "m\tull"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}}, 2), new String[][]{{"intValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1.5"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.lang.String", "1..5f"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.lang.String", "1..5f"}}, 3), new String[][]{{"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:6>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.util.Collection", "<sample:0>"}}, 3), new String[][]{{"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:8>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.util.Collection", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:10>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.util.Collection", "<sample:0>"}}, 3), new String[][]{{"POJONode", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<null>"}, false, 16, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"1.5f", "-3.4028235E38"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5f\":-3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-158322412", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5f\":-3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-158322412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "1", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1859454414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-641253045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "r", "NaN"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"r\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#-711416177", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:-0.015>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "<null>", "0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String", "1L"}}, 3), new String[][]{{"decimalValue", "", "4"}, {"floatValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:-0.03>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "<null>", "0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String", "1L"}}, 3), new String[][]{{"decimalValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:-0.015>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "<null>", "0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String", "\tL"}}, 3), new String[][]{{"decimalValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("1.0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=true, isFl...#310#218997028", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:0.235>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "1", "0"}}, 3), new String[][]{{"decimalValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1\":0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#-348165287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:0.235>"}, false, 8, new String[][]{}, 3), new String[][]{{"decimalValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "objectNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3), new String[][]{{"isObject", "", "1"}, {"isBigDecimal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"0y122C4567890xFFFFFFFF", "-469630869"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", ""}}, 3), new String[][]{{"isBigInteger", "", "4"}, {"deepCopy", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.String", "\tL", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\tL\":\"-0.0\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#-534446137", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"\tL"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "PT1H", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":[],\"\\tL\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#1603402475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"\tL{\"a\":1}"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "PT1H", "<sample:8>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":[],\"\\tL{\\\"a\\\":1}\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#965808271", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"\tL{\"a\":1}"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "PT1H", "<sample:7>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":-1,\"\\tL{\\\"a\\\":1}\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#1675546765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"0", "<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"0\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#-2049195649", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"0", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"0\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-511418108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"1\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#1416122654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String,java.util.List", "i", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"1\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#756207715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"11.1234567", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String,java.util.List", "i", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"11.1234567\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, is...#329#-1935923365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "{\"a\":1}", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{\\\"a\\\":1}\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#743716176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "{\"a\":1}", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "{\"a\":1}", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "{\"a\"1}", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{\\\"a\\\"1}\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-731144688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "{\"a\"1}", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "-1", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#308#-649420441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("2147483647 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fal...#317#803791851", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"[1,2]", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"[1+2]", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"[E1+2", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "-0.5"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"[E", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "-0.5"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "setAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:2>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"[E", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", "double", "-0.5"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "setAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "setAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:4>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "setAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1621599714", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"abaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"abaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1853268225", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"abaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"abaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#-515710973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "getNodeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"-0.0", "1E+100"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"-0.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1111747401", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"-0.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1111747401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".0.0", "1E+100"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\".0.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1081391350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".0.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1081391350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".09.0", "1E+100"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\".09.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-336575325", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".09.0\":1E+100} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-336575325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.util.Collection", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String,java.util.List", "-0.0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String,java.util.List", "-0.0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "intValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:10>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#1852476946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", new String[]{"byte[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"fwID\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-14944282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"AH8=\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-1946860506", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"/w==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#1066125898", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,boolean", "-0.0", "true"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,boolean", "-0.0", "false"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "iterator", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"-0.0\":false} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#-815891288", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "-0.0", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "-0.0", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"1E+100"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DecimalNode", actual.getClass().getName());
  assertEquals("1E+100 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=true, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false,...#315#1825854003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"-1E+100"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DecimalNode", actual.getClass().getName());
  assertEquals("-1E+100 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=true, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false...#316#-1247628826", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"-1E+100"}, false, 1, new String[][]{}), new String[][]{{"booleanValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("2147483648 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fal...#318#-958114935", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("2147483648 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fal...#318#-958114935", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#1640578355", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "-128"}}), new String[][]{{"isPojo", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"-9223372036854775808"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "127"}}), new String[][]{{"deepCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("-9223372036854775808 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, is...#328#1022465970", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"576460752303423489"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "127"}}), new String[][]{{"deepCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("576460752303423489 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDo...#326#457884024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"576460752303685633"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "127"}}), new String[][]{{"deepCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("576460752303685633 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDo...#326#-1674152997", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"33554433"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "127"}}), new String[][]{{"deepCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("33554433 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false,...#315#1131011459", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"33521665"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "127"}}), new String[][]{{"deepCopy", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("33521665 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false,...#315#2095074210", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":\"0x1F\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#118206725", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":\"0x1F\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#118206725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1.5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":\"1.5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#-338712266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\":\"1.5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#-338712266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\":\"1.5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-235911978", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":\"1.5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-235911978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1511577596", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1511577596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d4\":9223231299366420479,\"\u00e9\":[],\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoo...#365#-1779930461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d4\":9223231299366420479,\"\u00e9\":[],\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoo...#365#-1779930461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.5d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5d4\":9223231299366420479,\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#417113722", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5d4\":9223231299366420479,\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#417113722", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "1..5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "1.6d4", "9223231299366420479"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#-2050354535", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.6d4\":9223231299366420479,\"12:30:45\":\"1..5f\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fa...#358#-2050354535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asLong", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "java.lang.String", "1.5d4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asLong", new String[]{"long"}, new String[]{"26"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "java.lang.String", "1.5d4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "path", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"123456789012345678901234567890", "1.0"}, false), new String[][]{{"isNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-541047228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"12L456789012345678901234567890", "1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", "int", "-2147483648"}}), new String[][]{{"isNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"12L456789012345678901234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-1759600117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"12L456789012345678900234567890", "1.0"}, false), new String[][]{{"isNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"12L456789012345678900234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-1005575828", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"12L456789012345678900234567890", "NaN"}, false), new String[][]{{"isNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"12L456789012345678900234567890\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-467910332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"12L456789112345678900234567890", "NaN"}, false), new String[][]{{"isNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"12L456789112345678900234567890\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-699173051", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"12L4567891[2345678900234567890", "1.0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"12L4567891[2345678900234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#389500419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"12L4567891[2345678900234567890\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#389500419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "getNodeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1..5f", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", "{\"a\"1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "objectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNull", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{","}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{","}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "iterator", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isShort", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "without", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Float", "-1.0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.LongNode", actual.getClass().getName());
  assertEquals("9223372036854775807 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, is...#327#285233412", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"+1", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "traverse", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isObject", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isObject", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "1", "-32768"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "123456789012345678901234567890", "<null>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isObject", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "1", "-32768"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"5.3029"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:3>"}}), new String[][]{{"asLong", "", "6"}, {"isTextual", "", "0"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{"2;30:>5-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String,java.util.List", "0xFFFFFFFF", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String,java.util.List", "0xFFFFFFFF", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "1..5f", "-32768"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String,java.util.List", "0xFFFFFFFF", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1..5f\":-32768} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-2135284665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putObject", "java.lang.String", "0x123456789"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "1..5f", "-32768"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "objectNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"0x123456789\":{},\"1..5f\":-32768} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#695017334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"<a>b</a>", "-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"<a>b</a>\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1192311723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"<a>b</a>\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1192311723", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "get", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "nullNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "nullNode", new String[]{}, new String[]{}, false), new String[][]{{"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"-27"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "path", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"1.5f", "-3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.5f\":-3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-158322412", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.5f\":-3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-158322412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"1.12345678901234567", "-3.4028235E38"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.12345678901234567\":-3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#581315636", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.12345678901234567\":-3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#581315636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"1.12345678901234567", "-3.4028235E37"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.12345678901234567\":-3.4028235E37} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#168409429", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.12345678901234567\":-3.4028235E37} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#168409429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"1.1234o56789012345T67", "-3.4028235E37"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.1234o56789012345T67\":-3.4028235E37} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-2061220508", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.1234o56789012345T67\":-3.4028235E37} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-2061220508", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"0x123456789", "3.4028235E38"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"0x123456789\":3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#2133815670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"0x123456789\":3.4028235E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#2133815670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".09.0\":a} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-962289648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.0", "<sample:0>"}}), new String[][]{{"has", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.0", "<sample:0>"}}), new String[][]{{"has", "java.lang.String", "7"}, {"add", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[true] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, i...#314#1546467589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".09.0\":a} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-962289648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "1", "NaN"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1859454414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "setAll", "java.util.Map", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("-1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#309#-358944909", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:6>"}, false), new String[][]{{"doubleValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:5>"}, false), new String[][]{{"findParents", "java.lang.String,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "short", "32767"}}), new String[][]{{"isObject", "", "1"}, {"getNodeType", "", "3"}, {"asDouble", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("0 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-604960868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("-2147483648 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fa...#320#-1896634894", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isInt", ""}}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isInt", ""}}), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:-0.015>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("-0.015 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, ...#315#-2063962653", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:-0.015>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}}), new String[][]{{"decimalValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<d:-0.015>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "<null>", "0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String", "1L"}}), new String[][]{{"decimalValue", "", "4"}, {"floatValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"}", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"}\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-711971689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"}", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"}\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#292099093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{"ue"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "setAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:6>"}}), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"0", "10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"0\":10} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-259491417", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"0\":10} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-259491417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"0", "20"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"0\":20} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-344300888", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"0\":20} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-344300888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"02020-01-01", "9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"02020-01-01\":9} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#366122859", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"02020-01-01\":9} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#366122859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"02020-01-01", "9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}}), new String[][]{{"isBigInteger", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"02020-01-01\":9} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#366122859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"02020-01-01", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}}), new String[][]{{"isBigInteger", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"02020-01-01\":-2147483648} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#19607082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"02020-0-01", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}}), new String[][]{{"isBigInteger", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"02020-0-01\":-2147483648} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#-795108181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"02020-0-011", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}}), new String[][]{{"isBigInteger", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"02020-0-011\":-2147483648} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#1522210064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"020T0-0-011", "-2147483644"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}}), new String[][]{{"isBigInteger", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"020T0-0-011\":-2147483644} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#-1337094094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"020T0-0-011", "-2147483644"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isFloatingPointNumber", ""}}), new String[][]{{"isBigInteger", "", "4"}, {"fieldNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"020T0-0-011\":-2147483644} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#-1337094094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"0y122C4567890xFFFFFFFF", "-469630840"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", ""}}), new String[][]{{"isBigInteger", "", "4"}, {"deepCopy", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1757149530", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1757149530", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isIntegralNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.String", "\tL", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\tL\":\"-0.0\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#-534446137", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"\tL"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "PT1H", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":{},\"\\tL\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#1425145579", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"\tL"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "PT1H", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":-1.0,\"\\tL\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-968039569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"\tL"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "PT1H", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":[],\"\\tL\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#1603402475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isValueNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"0xFFFFFFFF\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, is...#329#385609145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", "long", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"123456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-497223024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-497223024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"123456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-497223024", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-497223024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"123456789012345678901234567890", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"123456789012345678901234567890\":\"AH8=\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#-803653597", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901234567890\":\"AH8=\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#-803653597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", "long", "1"}}, 2), new String[][]{{"isInt", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-497223024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"123456789012345678901244567890", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", "long", "1"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", ""}}, 2), new String[][]{{"isInt", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"123456789012345678901244567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#725379601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"133456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"133456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-265554513", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"133456789012345678901234567890\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-265554513", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"PT1H", "0"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "int", "-27"}}, 1), new String[][]{{"isContainerNode", "", "2"}, {"get", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"QT1H", "1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Short", "-1"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:5>"}}, 1), new String[][]{{"isContainerNode", "", "2"}, {"get", "java.lang.String", "2"}, {"isArray", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"QT1H", "1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Short", "-1"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:5>"}}), new String[][]{{"isContainerNode", "", "2"}, {"get", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "<null>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "<null>", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"1073741824"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "{0x1C", "-0.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{0x1C\":-0.5} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#-374726057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"1073741804"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "{0x1C", "-0.452"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{0x1C\":-0.452} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1532908549", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"1073872937"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "{0x1D", "-0.452"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{0x1D\":-0.452} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#38326234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"1073872937"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "{0x1D", "-0.452"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.0", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{0x1D\":-0.452,\".09.0\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#242525796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "{0x1D", "-0.452"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{0x1D\":-0.452,\".09.0\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#242525796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "{0x1D", "-0.452"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", ".09.", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{0x1D\":-0.452,\".09.\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tr...#335#-1814851992", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "longValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1234567", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1234567", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1234567", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1234567", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "short", "-32768"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"isMissingNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"2147483625"}, false), new String[][]{{"isMissingNode", "", "2"}, {"isBigDecimal", "", "0"}, {"doubleValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483625E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"2147483624"}, false), new String[][]{{"isMissingNode", "", "2"}, {"isBigDecimal", "", "0"}, {"doubleValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483624E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"isMissingNode", "", "2"}, {"isBigDecimal", "", "0"}, {"doubleValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483647E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"-2147483647"}, false), new String[][]{{"isMissingNode", "", "2"}, {"isBigDecimal", "", "0"}, {"doubleValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.147483647E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "getNodeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1..5f", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1..5f", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:kdy>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1..5f", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:kdy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1..5f\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#1528248882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,double", "+1", "1.0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:kdy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1\":[],\"+1\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#1703000332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,double", "+1", "1.0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:kdy>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1\":[],\"+1\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#1703000332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:kdy>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#756207715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Float"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NullNode", actual.getClass().getName());
  assertEquals("null {canConvertToInt=false, canConvertToLong=false, getNodeType=NULL, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#313#-712587992", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Float"}, new String[]{"-3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.FloatNode", actual.getClass().getName());
  assertEquals("-3.4028235E38 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDoubl...#322#1672049317", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Float"}, new String[]{"-3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "long", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", "boolean", "true"}}), new String[][]{{"longValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Float"}, new String[]{"Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "long", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", "boolean", "true"}}), new String[][]{{"longValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "at", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
