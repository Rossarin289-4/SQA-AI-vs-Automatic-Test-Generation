package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:11>", "<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Number] {getFieldCount=!NullPointerException, getMemberMethodCount=9, getModifiers=1025, getName=java.lang.Number, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:0>", "<sample:8>", "<sample:11>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<sample:12>", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<null>", "<sample:4>", "<null>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}), new String[][]{{"get", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:12>", "<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.util.Collection] {getFieldCount=0, getMemberMethodCount=21, getModifiers=1537, getName=java.util.Collection, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}}), new String[][]{{"getAnnotation", "java.lang.Class", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:2>", "<sample:7>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Gener...#244#-1583966529", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:0>"}}), new String[][]{{"listIterator", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "Hello, World", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"hasAnnotation", "java.lang.Class", "6"}, {"getAnnotations", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:11>", "<null>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getConstructors", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<empty>", "<sample:10>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>"}, true), new String[][]{{"getDefaultConstructor", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:12>", "<sample:1>", "<null>"}, true), new String[][]{{"getGenericType", "", "4"}, {"memberMethods", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=21}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<null>", "<sample:14>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<empty>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>", "<null>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#243#-426948191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:9>", "<null>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getDefaultConstructor", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:14>", "<sample:2>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getMemberMethodCount", "", "4"}, {"getAnnotated", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:3>", "<null>", "<sample:5>"}, true), new String[][]{{"getConstructors", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<empty>", "<sample:0>", "<null>"}, true), new String[][]{{"getStaticMethods", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:10>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"findMethod", "java.lang.String,java.lang.Class[]", "3"}, {"getStaticMethods", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:4>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"hasAnnotation", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[field java.lang.String#value], [field java.lang.String#coder], [field java.lang.String#hash]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:2>", "<sample:4>", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}, 2), new String[][]{{"iterator", "", "7"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<empty>"}}, 1), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>", "<sample:8>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#243#-426948191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:5>", "<sample:5>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.Object] {getFieldCount=0, getMemberMethodCount=11, getModifiers=1, getName=java.lang.Object, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:0>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"isPublic", "", "7"}, {"getFieldCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:1>", "<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:12>", "<sample:3>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[field java.lang.String#value], [field java.lang.String#coder], [field java.lang.String#hash]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:1>", "<null>", "false"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:7>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:1>", "<sample:2>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#length(0 params)] {getAnnotationCount=0, getFullName=java.lang.String#length(0 params), getGenericParameterTypes=[], getModifiers=1, getName=length, getParameterCount=0, getRa...#254#1875994588", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<null>", "<sample:0>", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:9>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.Arrays#asList(1 params)] {getAnnotationCount=0, getFullName=java.util.Arrays#asList(1 params), getGenericParameterTypes=[T[]], getModifiers=137, getName=asList, getParameterCount=1, ...#284#1809028230", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", ".1.5", "<sample:0>"}}, 3), new String[][]{{"getGenericReturnType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:2>"}}, 2), new String[][]{{"call", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"get", "java.lang.Class", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:3>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"getGenericType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", "java.lang.reflect.Method", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:9>", "<sample:11>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class", "<sample:4>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"getType", "com.fasterxml.jackson.databind.type.TypeBindings", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Generi...#243#-426948191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1), new String[][]{{"get", "java.lang.Class", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"getAnnotationCount", "", "5"}, {"getParameterAnnotations", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class java.lang.Object=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}, {class...#244#-1650311931", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 1), new String[][]{{"getParameterCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", new String[]{"java.lang.String", "java.lang.Class[]"}, new String[]{"", "<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 2), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#length(0 params)] {getAnnotationCount=0, getFullName=java.lang.String#length(0 params), getGenericParameterTypes=[], getModifiers=1, getName=length, getParameterCount=0, getRa...#254#1875994588", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<sample:2>", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:5>", "<sample:0>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 1), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#length(0 params)] {getAnnotationCount=0, getFullName=java.lang.String#length(0 params), getGenericParameterTypes=[], getModifiers=1, getName=length, getParameterCount=0, getRa...#254#1875994588", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:4>", "<null>", "<sample:9>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:2>", "<sample:11>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("[field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#number] {getAnnotationCount=0, getFullName=generated.algorithm.SearchInputFactory_scaffolding$TypeSampl.., getModifiers=1, getName...#223#-1818794759", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:0>", "<sample:6>", "<sample:14>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<sample:12>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class java.lang.Integer=GeneratedTestInputProxy}, {class java.lang.Object=GeneratedTestInputProxy, interface java.util.List=GeneratedTestInputProxy}, {interface java.util.List=GeneratedTestInputProx...#283#1662020093", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:10>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2), new String[][]{{"isPublic", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<sample:8>", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"setValue", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<null>", "<sample:12>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:1>", "<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:5>", "<empty>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("[field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text] {getAnnotationCount=0, getFullName=generated.algorithm.SearchInputFactory_scaffolding$TypeSampl.., getModifiers=1, getName=t...#219#1498108473", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:3>", "<sample:7>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class java.lang.Object=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}, {class...#244#-1650311931", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "2020-01-01", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#charAt(1 params)] {getAnnotationCount=0, getFullName=java.lang.String#charAt(1 params), getGenericParameterTypes=[int], getModifiers=1, getName=charAt, getParameterCount=1, ge...#260#-1532740946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>"}, true), new String[][]{{"getMemberMethodCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:0>", "<sample:1>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericSub=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"getGenericParameterTypes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T[]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}), new String[][]{{"annotations", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<empty>", "true"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#charAt(1 params)] {getAnnotationCount=0, getFullName=java.lang.String#charAt(1 params), getGenericParameterTypes=[int], getModifiers=1, getName=charAt, getParameterCount=1, ge...#260#-1532740946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[field java.lang.String#value], [field java.lang.String#coder], [field java.lang.String#hash]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", "java.lang.reflect.Field", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample, value=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#value], values=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values], ...#283#-787740737", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("format", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=60}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:4>", "<sample:4>", "<sample:10>"}, true), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", "java.lang.reflect.Method", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:5>", "<sample:10>", "<sample:1>"}, true), new String[][]{{"getDefaultConstructor", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.Object, annotations: {interface jdk.internal.HotSpotIntrinsicCandidate=@jdk.internal.HotSpotIntrinsicCandidate()}] {getAnnotationCount=1, getModifiers=1, getName=java.lang.O...#242#-1403162819", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", ""}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:1>", "<sample:0>", "<sample:0>", "<sample:5>"}}), new String[][]{{"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeySet", actual.getClass().getName());
  assertEquals("[key0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<sample:1>", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false), new String[][]{{"getGenericReturnType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", "java.lang.reflect.Method", "<null>"}}), new String[][]{{"size", "", "6"}, {"addIfNotPresent", "java.lang.annotation.Annotation", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class java.lang.Integer=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}), new String[][]{{"annotations", "", "5"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:0>", "<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class", "<sample:5>", "<sample:3>"}}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.Arrays#asList(1 params)] {getAnnotationCount=1, getFullName=java.util.Arrays#asList(1 params), getGenericParameterTypes=[T[]], getModifiers=137, getName=asList, getParameterCount=1, ...#284#49668359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "5"}, {"getRawParameterType", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:3>"}}), new String[][]{{"getValue", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}), new String[][]{{"isPublic", "", "7"}, {"call", "java.lang.Object[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>"}, true), new String[][]{{"getStaticMethods", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", new String[]{"java.lang.String", "java.lang.Class[]"}, new String[]{" ", "<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:2>", "<sample:12>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:12>"}}), new String[][]{{"getAnnotationCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>", "<sample:0>"}}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"clear", "", "7"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:2>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=, value=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#value], values=[field generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values], a...#282#-1518340382", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:15>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<empty>", "<sample:0>"}}), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<empty>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", "java.lang.Class", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<null>", "<sample:10>", "<sample:0>"}, true), new String[][]{{"hasAnnotation", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", new String[]{"java.lang.reflect.Constructor", "boolean"}, new String[]{"<null>", "false"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotation", "java.lang.Class", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", "com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", "java.lang.reflect.Method", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:2>", "<sample:7>", "<sample:0>"}, true), new String[][]{{"getAnnotated", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<empty>", "<sample:4>"}}), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=0, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:0>"}}), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:2>"}, false), new String[][]{{"getDeclaringClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}), new String[][]{{"annotations", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<null>", "<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[]", "<sample:2>"}}), new String[][]{{"getGenericType", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[] {getTypeName=T[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<empty>"}, false), new String[][]{{"getAnnotation", "java.lang.Class", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<null>", "<sample:1>", "<null>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}), new String[][]{{"getParameterAnnotations", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getParameterAnnotations", "int", "5"}, {"getRawType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}), new String[][]{{"getConstructors", "", "4"}, {"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false), new String[][]{{"getConstructors", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.String, annotations: [null]], [constructor for java.lang.S...#1213#-919755377", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "3"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:12>", "<null>", "<sample:3>"}, true), new String[][]{{"getConstructors", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:3>", "<sample:5>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getFieldCount=3, getMemberMethodCount=0, getModifiers=9, getName=generated.algorithm.SearchInputFactory_scaffolding$Gener...#244#2089405830", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<empty>", "<sample:2>", "true"}}), new String[][]{{"getValue", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false), new String[][]{{"getRawParameterType", "int", "5"}, {"addOrOverrideParam", "int,java.lang.annotation.Annotation", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:7>", "<sample:1>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedClass", actual.getClass().getName());
  assertEquals("[AnnotedClass int] {getFieldCount=0, getMemberMethodCount=0, getModifiers=1041, getName=int, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "-0.1", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}), new String[][]{{"call", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"getType", "com.fasterxml.jackson.databind.type.TypeBindings", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:4>"}}), new String[][]{{"isPublic", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:9>"}}), new String[][]{{"annotations", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:2>"}}), new String[][]{{"setValue", "java.lang.Object,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:10>", "<sample:5>", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{interface java.util.List=GeneratedTestInputProxy, int=GeneratedTestInputProxy, class [Ljava.lang.String;=GeneratedTestInputProxy}, {int=GeneratedTestInputProxy}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{class java.lang.Object=GeneratedTestInputProxy, class java.lang.Integer=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy} {size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", "java.lang.Class", "<sample:11>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<null>"}, false), new String[][]{{"getAnnotated", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", "java.lang.Class", "<sample:8>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", ""}}), new String[][]{{"memberMethods", "", "1"}, {"size", "", "4"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_isIncludableMemberMethod", "java.lang.reflect.Method", "<sample:3>"}}), new String[][]{{"annotations", "", "2"}, {"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:0>", "<sample:13>", "<sample:2>"}, true), new String[][]{{"getModifiers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "findMethod", "java.lang.String,java.lang.Class[]", "1.12345570", "<sample:0>"}}), new String[][]{{"getAnnotationCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", ""}}), new String[][]{{"getModifiers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false), new String[][]{{"hasAnnotations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:5>"}, false), new String[][]{{"getModifiers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", "java.lang.reflect.Method", "<sample:0>"}}), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:12>", "<sample:0>", "<sample:5>"}, true), new String[][]{{"getMemberMethodCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:8>", "<sample:1>"}}), new String[][]{{"remove", "java.lang.reflect.Method", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#toString(0 params)] {getAnnotationCount=0, getFullName=java.lang.String#toString(0 params), getGenericParameterTypes=[], getModifiers=1, getName=toString, getParameterCount=0,...#260#1165478806", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=59, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=60}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false), new String[][]{{"subList", "int,int", "2"}, {"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<sample:4>", "<null>", "<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:6>", "<sample:7>", "<sample:12>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"remove", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("[field java.lang.String#hash] {getAnnotationCount=0, getFullName=java.lang.String#hash, getModifiers=2, getName=hash, isPublic=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=2, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}, 2), new String[][]{{"addIfNotPresent", "java.lang.annotation.Annotation", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", "java.lang.Class,java.lang.Class,java.util.Map", "<sample:6>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotated", ""}}), new String[][]{{"add", "java.lang.annotation.Annotation", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{interface java.util.List=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", "java.lang.Class", "<sample:10>"}}), new String[][]{{"findMethod", "java.lang.String,java.lang.Class[]", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getGenericType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<null>", "<sample:9>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:11>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:5>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "fields", ""}}), new String[][]{{"isMapLikeType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", "java.lang.reflect.Method", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class", "<sample:9>", "<sample:10>"}}), new String[][]{{"values", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[0, sample, , [field java.lang.Integer#value]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:3>", "false"}}, 2), new String[][]{{"getMemberMethodCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"get", "java.lang.Class", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Method", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<sample:1>", "<sample:6>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "isPublic", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:6>", "<sample:9>", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:6>", "false"}}), new String[][]{{"getStaticMethods", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[method java.lang.String#indexOf(5 params)], [method java.lang.String#checkIndex(2 params)], [method java.lang.String#valueOf(1 params)], [method java.lang.String#valueOf(1 params)], [method java.lan...#1082#-235773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:12>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 2), new String[][]{{"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getType", new String[]{"com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasGenericTypes=false, isAbstra...#406#1123829549", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", "java.lang.annotation.Annotation[][]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.introspect.AnnotationMap;", actual.getClass().getName());
  assertEquals("[{class generated.algorithm.SearchInputFactory_scaffolding$GenericBase=GeneratedTestInputProxy, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf=GeneratedTestInputProxy}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructField", new String[]{"java.lang.reflect.Field"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMemberMethods", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<null>", "<sample:0>", "<sample:8>", "<sample:7>"}}), new String[][]{{"isPublic", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_collectRelevantAnnotations", new String[]{"java.lang.annotation.Annotation[][]"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getDefaultConstructor", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getFieldCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixUnders", "java.lang.reflect.Method,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getRawType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=, value=[field java.lang.String#value], coder=[field java.lang.String#coder], hash=[field java.lang.String#hash]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addClassMixIns", "com.fasterxml.jackson.databind.introspect.AnnotationMap,java.lang.Class,java.lang.Class", "<sample:5>", "<sample:1>", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getModifiers", ""}}), new String[][]{{"getRawType", "", "7"}, {"getMemberMethodCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAllAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<empty>", "<sample:8>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addConstructorMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("[null] {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:1>", "true"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withFallBackAnnotationsFrom", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[AnnotedClass java.lang.String]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFieldMixIns", new String[]{"java.lang.Class", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", ""}}), new String[][]{{"add", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getAnnotations", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "java.lang.annotation.Annotation", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationMap", actual.getClass().getName());
  assertEquals("{int=GeneratedTestInputProxy} {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=true, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "hasAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "constructWithoutSuperTypes", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver"}, new String[]{"<sample:11>", "<sample:13>", "<sample:5>"}, true), new String[][]{{"findMethod", "java.lang.String,java.lang.Class[]", "4"}, {"getMemberMethodCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addFactoryMixIns", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getConstructors", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructMethod", "java.lang.reflect.Method", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", "java.lang.Class,java.util.Map", "<sample:6>", "<sample:2>"}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "java.lang.Class", "com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"}, new String[]{"<null>", "<sample:1>", "<sample:1>", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", new String[]{"java.lang.reflect.Constructor", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean"}, new String[]{"<empty>", "<sample:3>", "false"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.annotation.AnnotationFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_findFields", new String[]{"java.lang.Class", "java.util.Map"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotationMap"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructConstructor", "java.lang.reflect.Constructor,boolean", "<sample:0>", "false"}}, 2), new String[][]{{"memberMethods", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", actual.getClass().getName());
  assertEquals("{isEmpty=false, size=60}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "memberMethods", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMethodMixIns", "java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap,java.lang.Class,com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap", "<sample:2>", "<sample:0>", "<sample:4>", "<sample:1>"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructCreatorMethod", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.util.Arrays#asList(1 params)] {getAnnotationCount=1, getFullName=java.util.Arrays#asList(1 params), getGenericParameterTypes=[T[]], getModifiers=137, getName=asList, getParameterCount=1, ...#284#49668359", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "withAnnotations", "com.fasterxml.jackson.databind.introspect.AnnotationMap", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "annotations", ""}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getMemberMethodCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_addMixOvers", "java.lang.reflect.Constructor,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean", "<sample:3>", "<null>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "getStaticMethods", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[AnnotedClass java.lang.String] {getFieldCount=3, getMemberMethodCount=60, getModifiers=17, getName=java.lang.String, hasAnnotations=false, isPublic=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
