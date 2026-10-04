package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:8>", "<sample:5>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.ArrayList", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}}, 1), new String[][]{{"withValueHandler", "java.lang.Object", "2"}, {"hasGenericTypes", "", "6"}, {"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"containedTypeCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"getContentValueHandler", "", "7"}, {"withStaticTyping", "", "1"}, {"hasGenericTypes", "", "6"}, {"isAbstract", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isFinal", ""}}, 1), new String[][]{{"getTypeHandler", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:8>", "<sample:2>", "<empty>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:8>", "<sample:5>", "<empty>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isFinal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L[Ljava/lang/String;;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Comparable;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/util/Collection;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/util/ArrayList;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, true, 0, null, 2), new String[][]{{"append", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaftrue", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, true, 0, null, 2), new String[][]{{"append", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;true", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("I", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#592#-1744841854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"containedTypeName", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}}, 3), new String[][]{{"append", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;4", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}}, 3), new String[][]{{"append", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;4", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/util/ArrayList;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L[Ljava/lang/String;;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getContentType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Comparable;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("322848676", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}}, 2), new String[][]{{"isThrowable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}}, 1), new String[][]{{"findSuperType", "java.lang.Class", "6"}, {"hasRawClass", "java.lang.Class", "6"}, {"withValueHandler", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#437#1443326404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}}, 1), new String[][]{{"findSuperType", "java.lang.Class", "6"}, {"hasRawClass", "java.lang.Class", "6"}, {"containedTypeName", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", new String[]{"int"}, new String[]{"-2147483648"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>", "<empty>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}), new String[][]{{"hasValueHandler", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}), new String[][]{{"hasValueHandler", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}), new String[][]{{"hasValueHandler", "", "0"}, {"withTypeHandler", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}}), new String[][]{{"append", "java.lang.String", "7"}, {"compareTo", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("75", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}}), new String[][]{{"append", "java.lang.String", "7"}, {"compareTo", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withStaticTyping", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getBoundName", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getBoundName", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getBoundName", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}}), new String[][]{{"getBoundName", "int", "5"}, {"withUnboundVariable", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getBindings", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}}), new String[][]{{"getBoundName", "int", "5"}, {"hasUnbound", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"getKeyType", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isArrayType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isFinal", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, true), new String[][]{{"append", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaftrue", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("I", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/util/List;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/util/List", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, true), new String[][]{{"lastIndexOf", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<empty>", "<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isJavaLangObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isPrimitive", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#592#-1744841854", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:y-yooe>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "_narrow", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}}), new String[][]{{"isAbstract", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:-15.0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "_narrow", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isConcrete", ""}}), new String[][]{{"isAbstract", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasRawClass", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasRawClass", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getSuperClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2"}, false), new String[][]{{"getSuperClass", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-14>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-25>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}}), new String[][]{{"containedType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getBindings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getBindings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getBindings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getBindings", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "2"}, {"getErasedSignature", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", ""}}), new String[][]{{"append", "long", "7"}, {"append", "char[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "-1"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "-1"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "-1"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "-1"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", "int", "-1"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class [Ljava.lang.String;] {getErasedSignature=L[Ljava/lang/String;;, getGenericSignature=L[Ljava/lang/String;;, getTypeName=[simple type, class [Ljava.lang.String;], hasGenericTypes=fal...#446#1027729191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:4>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
  assertEquals("[[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("322547479", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("322848676", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1063877001", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("104431", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, hasValueHandler=false, isAbstract=true, isArrayType=false, isCollec...#373#-71333800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isEnumType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1383349348", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Map] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map;, getTypeName=[simple type, class java.util.Map], hasGenericTypes=false, hasValueHandler=fals...#422#1547921031", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:1>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1815511358", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$TypeSamples] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$TypeSamp.., getGenericSignature=Lgenerated/a...#593#-1168679178", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "hashCode", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<null>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1195259504", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, hasValue...#434#-191599375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getTypeHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withContentValueHandler", "java.lang.Object", "<s:->"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, true), new String[][]{{"insert", "int,double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lg-1.0enerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", ""}}), new String[][]{{"isThrowable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isAbstract", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isThrowable", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeName", new String[]{"int"}, new String[]{"-1"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withValueHandler", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "hasGenericTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false), new String[][]{{"isFinal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false), new String[][]{{"append", "double", "5"}, {"append", "java.lang.String", "7"}, {"compareTo", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("84", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false), new String[][]{{"append", "double", "5"}, {"append", "java.lang.String", "7"}, {"compareTo", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("78", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.Collection] {getErasedSignature=Ljava/util/Collection;, getGenericSignature=Ljava/util/Collection;, getTypeName=[simple type, class java.util.Collection], hasGenericTypes...#450#560383109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getGenericSignature", "java.lang.StringBuilder", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Comparable] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable;, getTypeName=[simple type, class java.lang.Comparable], hasGenericTypes...#450#415087749", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:3aa>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", "java.lang.StringBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.ArrayList", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}}), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("L agenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isMapLikeType", ""}}, 1), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("L agenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("L agenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 1, new String[][]{}), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("L agenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("s aampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "toCanonical", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"47"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "isReferenceType", ""}}), new String[][]{{"isConcrete", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#594#-939702830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getContentType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "findTypeParameters", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:kdz>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getInterfaces", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:7>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.SimpleType", "getKeyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.SimpleType", "hasValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasGenericTypes=false, hasV...#438#-1355291917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}}), new String[][]{{"getBindings", "", "2"}, {"withUnboundVariable", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}}), new String[][]{{"getBindings", "", "2"}, {"withUnboundVariable", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.SimpleType", "com.fasterxml.jackson.databind.type.SimpleType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.SimpleType", "getParameterSource", ""}}), new String[][]{{"getBindings", "", "2"}, {"withUnboundVariable", "java.lang.String", "6"}, {"getBoundType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[simple type, class java.util.ArrayList] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList;, getTypeName=[simple type, class java.util.ArrayList], hasGenericTypes=fal...#447#542322716", SearchInputFactory_scaffolding.receiverState());
 }
}
