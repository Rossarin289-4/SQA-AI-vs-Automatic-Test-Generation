package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<s:_E>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}}), new String[][]{{"hasValueHandler", "", "3"}, {"withValueHandler", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; java.lang.Object {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[recursive type; java.lang.Object, hasContentType=true, hasGenericTypes=fa...#427#270243733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s: _>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:7>", "<sample:5>", "<sample:0>"}}), new String[][]{{"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<d:1.5>"}}, 2), new String[][]{{"getTypeName", "", "0"}, {"withStaticTyping", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#506#2021667248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:7>", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"hasHandlers", "", "3"}, {"getInterfaces", "", "2"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.54>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}}, 1), new String[][]{{"getBoundType", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483601"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>", "<sample:4>", "<sample:7>"}}, 2), new String[][]{{"getSuperClass", "", "5"}, {"getReferencedType", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}}, 1), new String[][]{{"getTypeParameters", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", "java.lang.Class", "<sample:1>"}}, 1), new String[][]{{"getRawClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}}, 2), new String[][]{{"asKey", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.Object<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}}, 1), new String[][]{{"asKey", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.String<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}}, 2), new String[][]{{"getParameterSource", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"getGenericSignature", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}, 2), new String[][]{{"isContainerType", "", "5"}, {"findSuperType", "java.lang.Class", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1), new String[][]{{"isContainerType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"getBindings", "", "1"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}, 1), new String[][]{{"getTypeHandler", "", "3"}, {"isMapLikeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#507#-1691514765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2056817302", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:Oub>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:_>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false), new String[][]{{"hasGenericTypes", "", "7"}, {"getValueHandler", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<empty>", "true"}, true), new String[][]{{"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"getSelfReferencedType", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isAbstract", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:_>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:5>", "<sample:6>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}}), new String[][]{{"getSelfReferencedType", "", "7"}, {"isThrowable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:Ouu>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:5>", "<sample:3>", "<sample:3>"}}), new String[][]{{"getBindings", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}}), new String[][]{{"asKey", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<null>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false), new String[][]{{"findBoundType", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"isReferenceType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", new String[]{"int"}, new String[]{"-16382"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<i:12>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"hasContentType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "13"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/String;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#645#743279511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "8175"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"getContentValueHandler", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; java.lang.Object {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[recursive type; java.lang.Object, hasContentType=true, hasGenericTypes=fa...#427#270243733", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}), new String[][]{{"findBoundType", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#507#-1691514765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:w>"}, false), new String[][]{{"containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"forcedNarrowBy", "java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}), new String[][]{{"hasHandlers", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<s:OuLW>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/algori...#686#-1946905944", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"withValueHandler", "java.lang.Object", "0"}, {"containedTypeCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Vc>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", "int", "-8388607"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 1, new String[][]{}), new String[][]{{"getGenericSignature", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}}), new String[][]{{"asKey", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.util.List<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, true), new String[][]{{"insert", "int,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isAbstract", ""}}), new String[][]{{"getParameterSource", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<i:-2147483629>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", ""}}), new String[][]{{"isConcrete", "", "2"}, {"getValueHandler", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"findSuperType", "java.lang.Class", "3"}, {"getKeyType", "", "4"}, {"toCanonical", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", "java.lang.Class", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}}, 2), new String[][]{{"findSuperType", "java.lang.Class", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"getRawClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:4>", "<sample:6>", "false"}, true), new String[][]{{"insert", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("skeyampleLjava/lang/Integer", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<empty>", "false"}, true), new String[][]{{"delete", "int,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgeerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}}), new String[][]{{"getRawClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}}, 3), new String[][]{{"containedType", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("322848676", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}}, 1), new String[][]{{"containedTypeCount", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"findTypeParameters", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", "java.lang.Class", "<sample:8>"}}), new String[][]{{"hasContentType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:3>"}}), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}), new String[][]{{"withValueHandler", "java.lang.Object", "3"}, {"getContentTypeHandler", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#507#-1691514765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-8388609"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}}), new String[][]{{"hasValueHandler", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<sample:2>"}}, 1), new String[][]{{"getRawClass", "", "2"}, {"getContentTypeHandler", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"hasUnbound", "java.lang.String", "3"}, {"getBoundType", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getReferencedType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:10>", "<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#507#-1691514765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false), new String[][]{{"containedTypeOrUnknown", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 3), new String[][]{{"getValueHandler", "", "6"}, {"getInterfaces", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<sample:5>"}}), new String[][]{{"findSuperType", "java.lang.Class", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:6>", "<sample:5>", "<null>"}}), new String[][]{{"hasUnbound", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:2>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}}, 3), new String[][]{{"getGenericSignature", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", ""}}), new String[][]{{"getErasedSignature", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false), new String[][]{{"getErasedSignature", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:e0>"}, false, 4, new String[][]{}), new String[][]{{"containedTypeName", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isCollectionLikeType", ""}}, 3), new String[][]{{"getTypeParameters", "", "6"}, {"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:aR>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:60>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}}), new String[][]{{"containedType", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"withUnboundVariable", "java.lang.String", "3"}, {"asKey", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.lang.String<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:Pub>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", ""}}), new String[][]{{"isMapLikeType", "", "0"}, {"isTypeOrSubTypeOf", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "1"}}, 2), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "1"}, {"getTypeName", "", "6"}, {"containedTypeCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"getTypeHandler", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:2.94>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", ""}}), new String[][]{{"containedType", "int", "6"}, {"isCollectionLikeType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}}), new String[][]{{"isEnumType", "", "2"}, {"containedTypeCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}}), new String[][]{{"getTypeHandler", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
}
