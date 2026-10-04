package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1.6e300", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "floatValue", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"1.12346678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "0", "<sample:0>"}}), new String[][]{{"has", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"0\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#1874388228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"trte", "1.7976931348623157E308"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "fields", ""}}), new String[][]{{"isObject", "", "5"}, {"isDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"trte\":1.7976931348623157E308} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1078143529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.util.Collection", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "2200096997376"}}), new String[][]{{"isBinary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"217483648", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"at", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"truH", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "|", "0.510"}}), new String[][]{{"add", "int,java.lang.Object", "2"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"|\":0.51} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#1023327168", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "without", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"Hllo, WorldProperty '", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "T1\u00e9H", "2097205"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:7>"}}), new String[][]{{"deepCopy", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"-0.0a<a>b</a>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "nullNode", ""}}, 2), new String[][]{{"isMissingNode", "", "6"}, {"at", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"a\037b", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ",0.0", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\",0.0\":-1.0,\"a\\u001Fb\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#804613037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\",0.0\":-1.0,\"a\\u001Fb\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#804613037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"0123"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", "2020-'-00", "<s:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"2020-'-00\":5} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#874506394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "Gello, Vorld1E-5", "0.385"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "<a", "24"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"Gello, Vorld1E-5\":0.385,\"<a\":24} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContain...#344#1614913287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"b/b", "<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "setAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.lang.String", "+"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", new String[]{"java.lang.Object"}, new String[]{"<i:-17>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", "011"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Long", "\"b\"91}", "-4611686018427387904"}}), new String[][]{{"asBoolean", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"011\":[],\"\\\"b\\\"91}\":-4611686018427387904} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, i...#352#-684225759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "retain", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asText", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asText", ""}}), new String[][]{{"fieldNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{")", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "D", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "long"}, new String[]{"TTitle2020,1-00", "2"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ",/a/b", "<null>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "\037", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\",/a/b\":null,\"\\u001F\":[],\"TTitle2020,1-00\":2} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fals...#356#13898840", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\",/a/b\":null,\"\\u001F\":[],\"TTitle2020,1-00\":2} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=fals...#356#13898840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"2147483I6p8", "-Infinity"}, false), new String[][]{{"get", "int", "4"}, {"elements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"2147483I6p8\":-Infinity} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tr...#335#1668304325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "\n}2020-02-30T2561:61"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asInt", "int", "-67633152"}}, 2), new String[][]{{"findParents", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, {\"\\n}2020-02-30T2561:61\":[],\"\":\"/w==\"}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\\n}2020-02-30T2561:61\":[],\"\":\"/w==\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-1105611895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "short"}, new String[]{"-:1.5{\"a\":1}", "32767"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", ""}}), new String[][]{{"findParents", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[{\"\":null,\"-:1.5{\\\"a\\\":1}\":32767}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":null,\"-:1.5{\\\"a\\\":1}\":32767} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#53250903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"", "<null>"}, false), new String[][]{{"has", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1203602753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "[H", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isFloat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "without", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ",0.01", "<sample:3>"}}), new String[][]{{"asToken", "", "5"}, {"findValuesAsText", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\",0.01\":false} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1284947072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"1/123456789012345672", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,boolean", "", "false"}}, 2), new String[][]{{"asInt", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\":false,\"1/123456789012345672\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#-1209907337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"int"}, new String[]{"975"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", "'"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"'\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#1122677992", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "-4611686018427387941"}, false), new String[][]{{"getNodeType", "", "5"}, {"findValue", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.LongNode", actual.getClass().getName());
  assertEquals("-4611686018427387941 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, i...#328#2109350765", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":-4611686018427387941} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tr...#335#806011709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"1EE-y5", "<null>"}, false), new String[][]{{"booleanNode", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1EE-y5\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1198040041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_childrenEqual", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:10>"}}), new String[][]{{"get", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"\t", "<null>"}, false), new String[][]{{"isDouble", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\t\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#1841852009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findPath", "java.lang.String", "0e10"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "with", "java.lang.String", "{"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"{\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#1524389337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"A,b,c2", "-0.09999999999999999"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "with", "java.lang.String", "<a>b</a>"}}), new String[][]{{"deepCopy", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"<a>b</a>\":{},\"A,b,c2\":-0.09999999999999999} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false...#355#436471830", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"<a>b</a>\":{},\"A,b,c2\":-0.09999999999999999} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false...#355#436471830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"i,", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "9223372036854775808"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putObject", "java.lang.String", "-.0"}}, 1), new String[][]{{"isArray", "", "4"}, {"findParent", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"-.0\":{},\"i,\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#787144941", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "", "-Infinity"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"java.lang.String"}, new String[]{"0b0"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,int", "1e10", "-2147483648"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.String", "abc", "http://examqle.com/a?b=c"}}), new String[][]{{"longValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1e10\":-2147483648,\"abc\":\"http://examqle.com/a?b=c\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#1250250866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Byte"}, new String[]{"1"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "9223372036854775808"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#308#110713798", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "get", new String[]{"int"}, new String[]{"-2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asText", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{"2020-1-00"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isFloatingPointNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "getNodeType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288528", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"add", "java.lang.Boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[true] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, i...#314#1546467589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "T1\u00e9H2020-1-00true", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("1.0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=true, isFl...#310#218997028", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"1L5.", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1L5.\":\"fwID\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-2070016576", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1L5.\":\"fwID\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-2070016576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "true", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"true\":9223372036854775807} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#771766578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "textValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigDecimal", "1E+100"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"\u00e9", "1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\u00e9\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#1740638448", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\u00e9\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#1740638448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{"-0.0Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Float", "12:30:45", "-0.362"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", ""}}, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"12:30:45\":-0.362} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, is...#329#2039584447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"java.lang.String"}, new String[]{"Gello, World1E-5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putObject", "java.lang.String", "020"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"020\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#-1567366586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isValueNode", ""}}, 1), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", "}ttp://exampl.com/a?b=c", "<s:,>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"}ttp://exampl.com/a?b=c\":,} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#-806989924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putArray", new String[]{"java.lang.String"}, new String[]{"123456789012>456c78"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isShort", ""}}, 2), new String[][]{{"add", "byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[\"BAUG\"] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false,...#316#972287908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"123456789012>456c78\":[\"BAUG\"]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#-1938761582", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValue", new String[]{"java.lang.String"}, new String[]{"[1,1]"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "textNode", new String[]{"java.lang.String"}, new String[]{"T1\u00e9Habc"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "get", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TextNode", actual.getClass().getName());
  assertEquals("\"T1\u00e9Habc\" {canConvertToInt=false, canConvertToLong=false, getNodeType=STRING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fa...#320#-124949349", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0x1F", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{"2."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1.25", "<sample:0>"}}, 1), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Float", "40.638"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_childrenEqual", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("2147483648 {canConvertToInt=false, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fal...#318#-958114935", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isValueNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"F\t", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"1E+100"}, false, 0, null, 1), new String[][]{{"findValuesAsText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"TITLyE", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isValueNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"TITLyE\":false} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1883981668", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"TITLyE\":false} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1883981668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Byte"}, new String[]{"-63"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "at", "com.fasterxml.jackson.core.JsonPointer", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "4294967296"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("-63 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#310#1110860717", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"java.lang.String"}, new String[]{"\037"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{"2020-1-00"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"268435456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Float", "http://exampl.com/a?b=c-0.0", "1.7014117E38"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("268435456 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false...#316#323070096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"http://exampl.com/a?b=c-0.0\":1.7014117E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false,...#354#-560220662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asText", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "aIcp"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", "0x1F"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"/y123456789", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isMissingNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isMissingNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", ">"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Float"}, new String[]{"1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "get", "int", "0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.FloatNode", actual.getClass().getName());
  assertEquals("1.0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#310#644538218", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isPojo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "fields", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"16777217"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParent", "java.lang.String", "55."}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String,java.util.List", "", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "PT1G", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"PT1G\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#1456167983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.String", "tru9", "adp"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "<a>b</a>", "0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"tru9\":\"adp\",\"<a>b</a>\":0.5,\"\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#-1483166659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"http:./examplf.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "elements", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"Hllo, WorldOroperty '", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "fields", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"Hllo, WorldOroperty '\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#513945499", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "ay", "-24"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "1.T", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"ay\":-24,\"1.T\":2147483647} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#-1436068326", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "2020-01-012020-1-00", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String", "\n}2020-02-30T25:61:61-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"2020-01-012020-1-00\":\"AH8=\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNo...#340#-266036719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Short"}, new String[]{"-2048"}, false, 5, new String[][]{}, 3), new String[][]{{"doubleValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2048.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "withArray", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "1"}}, 3), new String[][]{{"canConvertToLong", "", "2"}, {"findValues", "java.lang.String", "4"}, {"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putArray", new String[]{"java.lang.String"}, new String[]{" 1."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", "int", "-49"}}, 3), new String[][]{{"add", "java.lang.Boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[true] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, i...#314#1546467589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\" 1.\":[true]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#1887947301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"1.5e3001e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,boolean", "2020-1-00", "true"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"2020-1-00\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#-2091793253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, null, 3), new String[][]{{"hasNonNull", "java.lang.String", "5"}, {"doubleValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"[1,2]TITLE\u00e9", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "at", "java.lang.String", "010"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"java.lang.String"}, new String[]{"null0x123456789"}, false, 7, new String[][]{}, 3), new String[][]{{"floatValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"byte"}, new String[]{"127"}, false, 7, new String[][]{}, 3), new String[][]{{"isShort", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "setAll", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "1.1234567)", "0.26"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValue", new String[]{"java.lang.String"}, new String[]{"0200x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isShort", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"1.123456789L01234"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isBigInteger", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", "0wFFFEFFFFPT1H"}}, 3), new String[][]{{"isArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"0wFFFEFFFFPT1H\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true...#333#-1414504928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"[1,2]", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,double", "2x1F1.5f", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"2x1F1.5f\":Infinity,\"[1,2]\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#-1466848526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"2x1F1.5f\":Infinity,\"[1,2]\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#-1466848526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"[1,2\\1.5d", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"[1,2\\\\1.5d\":\"/w==\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-2044740280", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"[1,2\\\\1.5d\":\"/w==\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-2044740280", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"3", "0"}, false, 7, new String[][]{}, 2), new String[][]{{"asToken", "", "7"}, {"asBoolean", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{}, 3), new String[][]{{"intValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "elements", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "retain", "java.lang.String[]", "<sample:3>"}}, 3), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"java.lang.String"}, new String[]{"1F-"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Float", "-2.0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findPath", "java.lang.String", "020"}}, 3), new String[][]{{"booleanValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "get", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValue", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "retain", "java.util.Collection", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("-1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#309#-358944909", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_childrenEqual", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1e10\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1901244045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"-49"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"short"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ShortNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#309#460781523", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "objectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Byte"}, new String[]{"0"}, false), new String[][]{{"isDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"2E+100"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DecimalNode", actual.getClass().getName());
  assertEquals("2E+100 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=true, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false,...#315#1928330996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "-1.5", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"-1.5\":-2147483648} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#-541099625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Byte"}, new String[]{"63"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Float", "", "NaN"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("63 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#309#-1509588550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-641253045", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1.", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"1.\":\"AH8=\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-344620393", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"float"}, new String[]{"Infinity"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.FloatNode", actual.getClass().getName());
  assertEquals("Infinity {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fal...#317#664362429", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "byte", "127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isTextual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "0xFFFFFFFFF", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"0xFFFFFFFFF\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#-891993162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"", "-1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{".5", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "withArray", new String[]{"java.lang.String"}, new String[]{"Hllo, WorldProperty '"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"Hllo, WorldProperty '\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#-1275716895", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,byte[]", "truH", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"truH\":\"AH8=\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#523363971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{"T1\u00e9H"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "get", "int", "-22"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fields", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:`>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asText", new String[]{"java.lang.String"}, new String[]{",http:/0example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"a/b", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ".5", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\".5\":-1.0,\"a/b\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#646939577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".5\":-1.0,\"a/b\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#646939577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_childrenEqual", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValue", "java.lang.String", "\r"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBigInteger", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{"\n}2020-02-30T25:61:61"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "remove", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isValueNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "}", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"}\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#769661075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "getNodeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"0xFFFFFFFFPT1H", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParent", "java.lang.String", "1e10abcnull"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"0xFFFFFFFFPT1H\":10} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#1870838726", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"0xFFFFFFFFPT1H\":10} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#1870838726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "elements", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "short", "32767"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[],int,int", "<sample:2>", "2147483647", "-2147483648"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String,java.util.List", "2}", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "1-5", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "getNodeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isInt", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "trTH"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValue", new String[]{"java.lang.String"}, new String[]{"Titke"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "path", "int", "2146435072"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"\"b\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "1.5", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"1.5\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#1817446588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{"2.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "java.lang.String", "\013["}}), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Float", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x123456>89", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "2020-1-00-1", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "int"}, new String[]{"1x1F", "63"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,boolean", "1.", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.\":true,\"1x1F\":63} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-1818198698", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.\":true,\"1x1F\":63} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-1818198698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"int"}, new String[]{"-44"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", new String[]{"java.lang.Object"}, new String[]{"<i:-16777215>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("-16777215 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fals...#318#1158693819", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "\u00e9", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\u00e9\":1073741823} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#1047728205", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Byte", "-10"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "textNode", new String[]{"java.lang.String"}, new String[]{"ull"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TextNode", actual.getClass().getName());
  assertEquals("\"ull\" {canConvertToInt=false, canConvertToLong=false, getNodeType=STRING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-1881130998", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "doubleValue", ""}}), new String[][]{{"hasNext", "", "6"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "2}", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"2}\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#857944576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Long", ",0.0", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\",0.0\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1603108290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "-16383"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "fields", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"byte"}, new String[]{"32"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("32 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#309#52237016", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValue", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF--1"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"short"}, new String[]{"32767"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", ""}}), new String[][]{{"isBinary", "", "5"}, {"findParents", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "int"}, new String[]{"2a0F0-1-00", "2147483647"}, false, 6, new String[][]{}), new String[][]{{"isLong", "", "2"}, {"get", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"2a0F0-1-00\":2147483647} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tr...#335#1283832478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"e\t10"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isPojo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "{\"a\":", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{\\\"a\\\":\":0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-267829028", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "floatValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"http://exampl.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,double", " ", "1.7976931348623158E307"}}), new String[][]{{"elements", "", "4"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"1e10Iccnull"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String,java.util.List", "0xFFFFFXFFPT1H2", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putArray", new String[]{"java.lang.String"}, new String[]{"a,b,pc"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "9223372036854808576"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"a,b,pc\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-1787434082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("-2147483648 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fa...#320#-1896634894", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBinary", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Double", "2", "0.26"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"2\":0.26} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#311802658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asDouble", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findPath", "java.lang.String", "1EC,5"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValue", "java.lang.String", "{T1\u00e8H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"findValues", "java.lang.String,java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isIntegralNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "{\"2\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"{\\\"2\\\":1}\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#1021292645", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"findParent", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"http://example.coa", "1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "java.lang.String", "1.1234567890123456m"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"http://example.coa\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#1633086162", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"http://example.coa\":1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#1633086162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.5e30 ", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"."}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,byte[]", "1-f5", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"1-f5\":\"BAUG\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-142128210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "double"}, new String[]{"{\"a\":1}", "-8.98846567431158E307"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"{\\\"a\\\":1}\":-8.98846567431158E307} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#707091779", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"{\\\"a\\\":1}\":-8.98846567431158E307} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#707091779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "objectNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNull", ""}}), new String[][]{{"canConvertToLong", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1.2\u00e9", "-0.1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fields", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isShort", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isPojo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"123456789012>45678901234567890", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "decimalValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"1.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isBoolean", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DecimalNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=true, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#-1092496076", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "has", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putAll", "com.fasterxml.jackson.databind.node.ObjectNode", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Boolean", "}", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "float"}, new String[]{"1.1234678901234567", "NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1.1234678901234567\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#-2099572496", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1.1234678901234567\":NaN} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#-2099572496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "at", new String[]{"java.lang.String"}, new String[]{"{]a#:1}"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "short", "-32768"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isPojo", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "elements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "textNode", new String[]{"java.lang.String"}, new String[]{"Hllo, Worl"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ",", "<sample:2>"}}), new String[][]{{"findParents", "java.lang.String", "7"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "traverse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrentName=null, ge...#459#2121684838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "with", new String[]{"java.lang.String"}, new String[]{"1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "get", "java.lang.String", ".5f"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "traverse", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1}\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1788735770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "path", new String[]{"java.lang.String"}, new String[]{"0xFhFFFFFFFPT1H1.12345678"}, false), new String[][]{{"isIntegralNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "without", new String[]{"java.lang.String"}, new String[]{"1.252020-1-00"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "TTitle", "-32768"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"TTitle\":-32768} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1464223817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"TTitle\":-32768} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1464223817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kel>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValues", "java.lang.String,java.util.List", "Hello, World", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{"{\"a#:1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToInt", ""}}), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "bigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigDecimal", "0.1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putNull", "java.lang.String", "1x1F"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=fals...#332#1995488770", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "set", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{".5I", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\".5I\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#1112082958", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".5I\":-1.0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#1112082958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"00a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "http;//exampl.com/a?b=c", "<sample:3>"}}), new String[][]{{"isBoolean", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"http;//exampl.com/a?b=c\":false} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#1183329969", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asInt", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"abc", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.String", "\u00ea", "acp"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "fields", ""}}), new String[][]{{"isMissingNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\u00ea\":\"acp\",\"abc\":\"fwID\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tru...#334#2113666954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"long"}, new String[]{"1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#308#110713798", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParent", new String[]{"java.lang.String"}, new String[]{"Tiule1.6e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "intValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", "\t", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"\\t\":0} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-196195858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"\u00e9a", "Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "objectNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"\u00e9a\":Infinity} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1023487224", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\u00e9a\":Infinity} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1023487224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isTextual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findPath", "java.lang.String", "http://exampl.coom/a?b=c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"\u00ea", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"\u00ea\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#51243018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{"2}-"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Long", "2147483648", "-4194304"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isNull", ""}}), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Boolean", "a/b1.25", "<null>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "isBigInteger", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"a/b1.25\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#793801115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"int"}, new String[]{"38"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("38 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#309#318075154", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isPojo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "y", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "traverse", "com.fasterxml.jackson.core.ObjectCodec", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"y\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false...#317#-1146850176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{"1..1E-5"}, false), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_at", new String[]{"com.fasterxml.jackson.core.JsonPointer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "TITLE1.5d", "-32768"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"TITLE1.5d\":-32768} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#1963798757", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.1234667890123456http://example.com/a?b=c", "<sample:0>"}, false), new String[][]{{"isArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"1.1234667890123456http://example.com/a?b=c\":\"/w==\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoole...#363#-1052243984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "replace", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ":", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\":\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#-717482310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "_childrenEqual", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putObject", "java.lang.String", "\n}2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\n}2020-02-30T25:61:61\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#1377811537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".", "\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "float", "NaN"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\".\":\"\u00e9\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#-1445128917", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\".\":\"\u00e9\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#-1445128917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{"b"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "2010-1-00", "1.0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "equals", "java.lang.Object", "<s:V>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Float", "1", "-1.0"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "removeAll", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "get", "int", "-22"}}), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "deepCopy", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findParents", "java.lang.String,java.util.List", "b\n", "<sample:4>"}}), new String[][]{{"asInt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "textNode", new String[]{"java.lang.String"}, new String[]{"0\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "path", "int", "2147483647"}}), new String[][]{{"isValueNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "long"}, new String[]{"PT1H", "-4611686018427385856"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"PT1H\":-4611686018427385856} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#1265923613", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"PT1H\":-4611686018427385856} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#1265923613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBinary", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigDecimal", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Boolean", "\n 1.12345678", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\n 1.12345678\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-1464412999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"QT1H", "1.7014117E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asText", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"QT1H\":1.7014117E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-1920365374", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"QT1H\":1.7014117E38} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-1920365374", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "_at", "com.fasterxml.jackson.core.JsonPointer", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", "http://exampl.com/a?b=cTitle", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"http://exampl.com/a?b=cTitle\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#1504106409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isBigInteger", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775810"}, false, 1, new String[][]{}), new String[][]{{"isBigInteger", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "float", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "\t", "1"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "without", "java.util.Collection", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\t\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fals...#318#216710349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findPath", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,float", "2020-1-00", "Infinity"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "arrayNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"2020-1-00\":Infinity} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-1937837663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "replace", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"1.Hllo, WorldProperty '", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "short", "32767"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "retain", "java.util.Collection", "<null>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "T1\u00e9H-0.0", "-32768"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42863118", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "canConvertToLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "set", "java.lang.String,com.fasterxml.jackson.databind.JsonNode", ">rue", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\">rue\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fa...#320#-1263331847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "get", new String[]{"int"}, new String[]{"-2146435072"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"1.0"}, false), new String[][]{{"isContainerNode", "", "6"}, {"canConvertToInt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "pojoNode", new String[]{"java.lang.Object"}, new String[]{"<i:-3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("-3 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#311#58277862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Short"}, new String[]{"-16383"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ShortNode", actual.getClass().getName());
  assertEquals("-16383 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, ...#314#370273854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String"}, new String[]{"1.252020-2-00"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "hashCode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "booleanNode", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"1234567890123456789012345678901/12345678", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "2}", "50.10"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "booleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "withArray", "java.lang.String", "?|"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"?|\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=fal...#319#1038717129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"float"}, new String[]{"3.4028235E38"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.FloatNode", actual.getClass().getName());
  assertEquals("3.4028235E38 {canConvertToInt=false, canConvertToLong=false, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble...#321#6481202", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "binaryValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"0+1", "9223372032564002815"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Short", "p", "32759"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "findValue", "java.lang.String", "T>\u00e9H"}}), new String[][]{{"booleanValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String"}, new String[]{")"}, false, 6, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "elements", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.math.BigInteger", "1"}}), new String[][]{{"hasNext", "", "6"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "short"}, new String[]{"Hllo, WorldProperty '", "-2047"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isMissingNode", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "textValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"Hllo, WorldProperty '\":-2047} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1336300189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"Hllo, WorldProperty '\":-2047} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1336300189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "hasNonNull", new String[]{"java.lang.String"}, new String[]{"[1-2]I"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "putPOJO", "java.lang.String,java.lang.Object", "217483647", "<s:`0d>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "asText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"217483647\":`0d} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-78344250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "byte[]"}, new String[]{"0,2]", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "asLong", "long", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"0,2]\":\"fwID\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#630799373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"0,2]\":\"fwID\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#630799373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"Gdllo, Wnrld1E-5", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.math.BigDecimal", "12:30:l5", "0.062"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{\"12:30:l5\":0.062,\"Gdllo, Wnrld1E-5\":1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-622263505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findParents", new String[]{"java.lang.String"}, new String[]{"21474836471.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,long", "Gello, World1E-5", "-4194305"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,double", "2TITLE", "1.7976931348623158E307"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"Gello, World1E-5\":-4194305,\"2TITLE\":1.7976931348623158E307} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false,...#371#848517384", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "fieldNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,double", "a", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "isMissingNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,byte[]", "{1.25", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "putArray", "java.lang.String", "2020-01-01Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putArray", new String[]{"java.lang.String"}, new String[]{"\n}2020.02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "shortValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "fields", ""}}), new String[][]{{"has", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"\\n}2020.02-30T25:61:61\":[]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#-1864148624", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"/a//b", "<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "remove", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isArray", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "traverse", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrentName=null, ge...#459#2121684838", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.math.BigDecimal"}, new String[]{"0.1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", "java.lang.String,java.util.List", "-0-0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DecimalNode", actual.getClass().getName());
  assertEquals("0.1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=true, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFl...#310#-113657806", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValues", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1E-612:30:45", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isBigDecimal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "POJONode", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "isContainerNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("a {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-901225461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "traverse", new String[]{}, new String[]{}, false), new String[][]{{"getCurrentName", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "textValue", ""}, {"com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", "java.lang.Long", "-4611686018427387904"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "findValuesAsText", new String[]{"java.lang.String", "java.util.List"}, new String[]{"tue", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "has", "java.lang.String", "2021-02-30T25:\n1:61"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "put", new String[]{"java.lang.String", "long"}, new String[]{"1E-5", "-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"1E-5\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#1710446568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1E-5\":-1} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#1710446568", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"java.lang.Double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Integer", "1", "-1073741760"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.DoubleNode", actual.getClass().getName());
  assertEquals("-2.0 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=true, isF...#311#193109040", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1\":-1073741760} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#1974843588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "textNode", new String[]{"java.lang.String"}, new String[]{"uL2147483648"}, false, 1, new String[][]{}), new String[][]{{"asBoolean", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "putArray", new String[]{"java.lang.String"}, new String[]{"1E--5"}, false), new String[][]{{"add", "java.lang.Boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[true] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, i...#314#1546467589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"1E--5\":[true]} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1851006399", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.node.ObjectNode", "numberNode", new String[]{"long"}, new String[]{"2097717"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.ObjectNode", "put", "java.lang.String,java.lang.Long", "", "9223372036854775807"}, {"com.fasterxml.jackson.databind.node.ObjectNode", "binaryNode", "byte[]", "<sample:1>"}}), new String[][]{{"findValuesAsText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{\"\":9223372036854775807} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tru...#334#266368036", SearchInputFactory_scaffolding.receiverState());
 }
}
